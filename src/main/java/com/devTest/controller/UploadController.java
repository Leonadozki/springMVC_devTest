package com.devTest.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    /**
     *  传统方法上传文件
     */
    @RequestMapping("/oldWay")
    public void testUpload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 获取上传路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        // 判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        // 解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 解析request
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem fileItem : fileItems){
            if (fileItem.isFormField()){
                // 说明是普通表单项
            }else{
                // 获取上传文件名称
                String name = fileItem.getName();
                // 文件名称换成唯一值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                name = uuid + "_" + name;
                System.out.println(name);
                // 完成文件上传
                fileItem.write(new File(path, name));
                // 删除临时文件
                fileItem.delete();
            }
        }
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
    }

    /**
     *  SpringMVC上传
     *  需要配置上传文件解析器
     */
    @RequestMapping("/springMvcWay")
    public void testSpringMvcUpload(HttpServletRequest request,
                                    HttpServletResponse response,
                                    MultipartFile upload) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        // 判断路径是否存在
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        // 获取上传文件名称
        String uploadName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        uploadName = uuid + "_" +uploadName;
        // 完成文件上传
        upload.transferTo(new File(path, uploadName));
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
    }

    /**
     *  跨服务器上传文件
     */
    @RequestMapping("/serverWay")
    public String testServerUpload(MultipartFile upload) throws Exception {
        // 定义上传文件服务器路径
        String path = "http://localhost:8090/uploads/";
        // 获取上传文件的名称
        String name = upload.getOriginalFilename();
        // 文件名称设置唯一值uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        name = uuid + "_" + name;
        // 创建客户端对象（基于jersey包）
        Client client = Client.create();
        // 和图片服务器连接
        WebResource resource = client.resource(path + name);
        // 上传文件（字节流）
        resource.put(upload.getBytes());
        return "upload_success";
    }
}
