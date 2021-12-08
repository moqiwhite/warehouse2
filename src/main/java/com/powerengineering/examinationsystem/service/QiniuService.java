package com.powerengineering.examinationsystem.service;

import java.io.InputStream;
import java.util.Map;

public interface QiniuService {

    Map uploadInputStream(InputStream inputStream)throws Exception;


}
