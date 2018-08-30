package com.nbt.erp.orm.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.nbt.erp.orm.MySqlTestConfig;
import com.nbt.erp.orm.entity.WorkOrder;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MySqlTestConfig.class})
@ActiveProfiles("test")
public class WorkOrderRepoTest {

	@Autowired
	private WorkOrderRepo workOrderRepo;
	
	@Test
	public void basicCrubOperationsShouldSucceed(){
		WorkOrder workOrder = MockGenerator.getMockWorkOrder();
		
		workOrderRepo.save(workOrder);
	}
	
}
