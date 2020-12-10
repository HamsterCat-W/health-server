package com.example.healthMangement.Controller;

import com.example.healthMangement.Entity.DiaryInfo;
import com.example.healthMangement.Entity.DiaryInfoDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DiaryInfoController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    DiaryInfoDAO diaryInfoDAO;

    //查询全部
    @GetMapping("/diary")
    public List<DiaryInfo> getAllDiary(){
        logger.info("========>查询DiaryInfo表的所有数据");
        return diaryInfoDAO.findAll();
    }

    //日记编号查询
    @GetMapping("/diary/{diaryId}")
    public DiaryInfo getDiaryById(@PathVariable String diaryId){
        logger.info("========>查找了diaryId="+diaryId+" 的diary信息");
        return diaryInfoDAO.findById(diaryId);
    }


    //插入
    @PostMapping(value = "/diary/add", consumes = "application/json",produces = "application/json")
    public int insertById(@RequestBody DiaryInfo diaryInfo){
        logger.info("========>加入了diaryId="+diaryInfo.getDiaryId()+" 的日记");
        return diaryInfoDAO.insert(diaryInfo);
    }

    //删除
    @DeleteMapping("/diary/delete/{diaryId}")
    public int deleteById(@PathVariable String diaryId){
        logger.info("========>删除了diaryId="+diaryId+" 的日记");
        return diaryInfoDAO.deleteById(diaryId);
    }

    //修改
    @PutMapping(value = "/diary/update",consumes = "application/json",produces = "application/json")
    public int update(@RequestBody DiaryInfo diaryInfo){
        logger.info("========>修改了diaryId="+diaryInfo.getDiaryId()+" 的日记");
        return diaryInfoDAO.update(diaryInfo);
    }



}
