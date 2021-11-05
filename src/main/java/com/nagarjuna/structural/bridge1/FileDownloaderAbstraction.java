package com.nagarjuna.structural.bridge1;

public interface FileDownloaderAbstraction 
{
    public Object download(String path);
     
    public boolean store(Object object);
}
