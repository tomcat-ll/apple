package test.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName:picservice
 * @Author lilei
 * @Date 2020/12/14
 * @Version 1.0
 */
public interface picservice {
    public String updateImage(MultipartFile pic);
}

