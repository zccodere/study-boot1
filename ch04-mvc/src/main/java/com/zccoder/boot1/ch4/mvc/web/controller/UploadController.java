package com.zccoder.boot1.ch4.mvc.web.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传控制器
 * @author ZhangCheng
 * @date 2017-04-04
 * @version V1.0
 */
@Controller
public class UploadController {

    private static String FILE_UPLOAD_PATH = "d:/upload/";

    /**
     * // 使用MultipartFile接受上传的文件。
     * @param file
     * @return
     */
    @PostMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file){

        try{
            // 使用FileUtils.writeByteArrayToFile快速写文件到磁盘。
            FileUtils.writeByteArrayToFile(new File(FILE_UPLOAD_PATH+file.getOriginalFilename()),file.getBytes());
            return "success";
        }catch (IOException ioex){
            ioex.printStackTrace();
            return "fial";
        }

    }

}
