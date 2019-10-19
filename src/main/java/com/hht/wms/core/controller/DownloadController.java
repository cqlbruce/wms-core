/**
 * Copyright (C), 2018-2019, 深圳惠金卓信科技有限公司
 * FileName: DownloadController
 * Author:   MG01873
 * Date:     2019/10/8 16:31
 * Description: 其他下载控制类
 * History:
 */
package com.hht.wms.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 〈其他下载控制类〉
 *
 * @author MG01873
 * @create 2019/10/8
 * @since 1.0.0
 */
@RestController
@CrossOrigin
@RequestMapping("/download/")
public class DownloadController {
    private static final Logger LOG = LoggerFactory.getLogger(DownloadController.class);

    @RequestMapping("stockFile")
    public byte[] stockFile() {
        try {
            ClassPathResource classPathResource = new ClassPathResource("fileTemplate/stock.xlsx");
            InputStream inputStream = classPathResource.getInputStream();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len;
            while((len = inputStream.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            LOG.error("下载入库模板失败：{}", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("shippedFile")
    public byte[] shippedFile() {
        try {
            ClassPathResource classPathResource = new ClassPathResource("fileTemplate/shipped.xlsx");
            InputStream inputStream = classPathResource.getInputStream();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len;
            while((len = inputStream.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            LOG.error("下载出库模板失败：{}", e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}