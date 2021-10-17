package Utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class HttpClientUtils
{


    public static void main(String[] args) throws Exception
    {
        String url = "http://www.landcloud.org.cn";
        String text = getResponseString(url);
        System.out.println("----------------------------------------");
        System.out.println(text);
    }

    private static String getResponseString(String url) throws Exception
    {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try
        {
            HttpGet httpGet = new HttpGet(url);
            ResponseHandler<String> responseHandler = new ResponseHandler<String>()
            {
                @Override
                public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException
                {
                    int status = httpResponse.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300)
                    {
                        HttpEntity entity = httpResponse.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };
            String responseBody = httpClient.execute(httpGet, responseHandler);
            return responseBody;
        }
        finally
        {
            httpClient.close();
        }
    }
}
