package com.example.chuyen_doi_tien_te;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class appmain {
    @GetMapping
    public ResponseEntity tinh(@RequestParam("type") String type, @RequestParam("money") int money){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("usd",23000);
        map.put("eur",23783);
        map.put("jpy",17163);
        if(map.equals(type)){
            return ResponseEntity.ok(type+ ": "+map.get(type).intValue()+"=> "+ map.get(type).intValue() * money);
        }
        return ResponseEntity.ok("khong tim thay");
    }
}
