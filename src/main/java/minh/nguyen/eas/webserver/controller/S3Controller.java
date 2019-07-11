package minh.nguyen.eas.webserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import minh.nguyen.eas.webserver.service.AmazonClient;

@RestController
@RequestMapping("/s3")
public class S3Controller {
	
	private AmazonClient amazonClient;

    @Autowired
    S3Controller(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
    	System.out.println("Hello S3");
        String fileUrl = this.amazonClient.uploadFile(file);
        System.out.println(fileUrl);
        return fileUrl;
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    } 

}
