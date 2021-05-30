package com.canary.controller;

import java.io.File;
import java.io.IOException;

import com.canary.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Qixiang Shao
 * @Date: 2021/05/26/2:32 下午
 * @Description:
 */

@RestController
public class ImageController {


    @PostMapping("/image/upload")
    public String coversUpload(MultipartFile file) {
        String folder = "/Users/natsu/Desktop/img/";
        File imageFolder = new File(folder);
        File f = new File(imageFolder, StringUtils.getRandomString(6) + file.getOriginalFilename()
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            String imgURL = "http://localhost:8081/api/file/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
