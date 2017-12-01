package Test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * Created by junshuaizhang1 on 2017/11/8.
 */
public class TestJSON {

    public static void main(String[] args){
        TJSONObject tjsonObject = new TJSONObject();
        tjsonObject.setName("123456");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("12316544987");
        strings.add("http://12345678sdhfhasjkdfkjsahlkas");
        tjsonObject.setList(strings);
        String s = JSON.toJSONString(tjsonObject);
        System.out.println(s);

        TJSONObject tjsonObject1 = JSON.parseObject(s, TJSONObject.class);
        System.out.println(JSON.toJSONString(tjsonObject1));
    }
}
