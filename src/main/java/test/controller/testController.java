package test.controller;



import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import test.service.picservice;

import java.util.logging.Logger;


/**
 * @ClassName:testController
 * @Description:
 * @Author li
 * @Date 2020/9/14
 * @Version 1.0
 */
@RestController
public class testController {
    @Autowired
    picservice p;
    @GetMapping(value = "/hi")
    public String getHi(){
        return "hi----"+"apple+555555";
    }

    @ApiOperation(value = "图片上传")
    @PostMapping(value = "/updateImage")
    public String updateImage(
            @ApiParam(value = "上传图片文件",required = true)@RequestParam() MultipartFile pic){
        String a =  p.updateImage(pic);
        Logger.getLogger("updateImage").info("收到消息" + a);
        return a;
    }
}
