package chz1801308031.com.bean;

import java.util.List;

public class VideoListResponse {

    private String result;
    private List<VideoInfo> list;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<VideoInfo> getList() {
        return list;
    }

    public void setList(List<VideoInfo> list) {
        this.list = list;
    }
}
