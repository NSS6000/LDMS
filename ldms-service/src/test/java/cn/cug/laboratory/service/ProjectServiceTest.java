/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.cug.laboratory.service;

import cn.cug.laboratory.model.extend.ProjectExtend;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @autor shixing
 * @since 1.0.0
 */

public class ProjectServiceTest extends AbstractSpringTest {

    @Autowired
    private ProjectService projectService;

    @Test
    public void testSelectByMultipleInfo(){
//        ProjectExtend projectExtend = new ProjectExtend();
//        List<ProjectExtend> list = projectService.selectByMultipleInfo(projectExtend);
//        System.out.println(list);
    }

    @Test
    public void testGetlastId(){
        System.out.println(projectService.getNewId());
    }

    @Test
    public void testgetById(){
        System.out.println(projectService.getById("p1605006"));
    }



}
