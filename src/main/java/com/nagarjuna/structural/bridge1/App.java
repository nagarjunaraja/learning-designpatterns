package com.nagarjuna.structural.bridge1;

public class App {

	public static void main(String[] args) 
    {
        String os = "linux";
        FileDownloaderAbstraction downloader = null;
 
        switch (os) 
        {
            case "windows":
                downloader = new FileDownloaderAbstractionImpl( new WindowsFileDownloadImplementor() );
                break;
                 
            case "linux":
                downloader = new FileDownloaderAbstractionImpl( new LinuxFileDownloadImplementor() );
                break;
                 
            default:
                System.out.println("OS not supported !!");
        }
         
        Object fileContent = downloader.download("some path");
        downloader.store(fileContent);
    }
}
