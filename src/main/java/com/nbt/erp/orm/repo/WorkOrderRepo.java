package com.nbt.erp.orm.repo;

import org.springframework.data.repository.CrudRepository;
import com.nbt.erp.orm.entity.WorkOrder;

public interface WorkOrderRepo extends CrudRepository<WorkOrder, Long>{
	
}
