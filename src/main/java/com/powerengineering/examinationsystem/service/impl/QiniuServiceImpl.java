package com.powerengineering.examinationsystem.service.impl;

import com.google.gson.Gson;
import com.powerengineering.examinationsystem.service.QiniuService;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class QiniuServiceImpl implements QiniuService {

    @Autowired
    private UploadManager uploadManager;//已经创建好的对象

    @Autowired
    private Auth auth;//创建好的上传凭证

    @Autowired
    private Gson gson;//创建好的分析结果

    @Value("${qiniu.bucket}")//七牛云的库名
    private String bucket;


    @Override
    public Map uploadInputStream(InputStream inputStream) throws Exception {

        Map map = new HashMap();
        //上传到七牛云
        Response response = this.uploadManager.put(inputStream,null,this.auth.uploadToken(bucket),null,null);
        //分析上传的文件
        DefaultPutRet putRet = gson.fromJson(response.bodyString(),DefaultPutRet.class);
        //得到新的名字
        String fileName = putRet.hash;
        map.put("response",response);
        map.put("fileName",fileName);
        return map;
    }






}
