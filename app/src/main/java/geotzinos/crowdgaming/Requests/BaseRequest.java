package geotzinos.crowdgaming.Requests;

/**
 * Created by George on 2016-05-29.
 */
public class BaseRequest {
    private final String SERVER_URL = "http://83.212.118.212/";
    private String webServiceUrl;

    public String getSERVERURL() {
        return SERVER_URL;
    }

    public String getWebServiceUrl() {
        return webServiceUrl;
    }

    public void setWebServiceUrl(String webServicePath) {
        if(webServicePath.startsWith("/"))
        {
            this.webServiceUrl = SERVER_URL + webServicePath.substring(1,webServicePath.length());
        }
        else
        {
            this.webServiceUrl += SERVER_URL + webServicePath;
        }
    }

    public BaseRequest(String webServicePath)
    {
        setWebServiceUrl(webServicePath);
    }


}
