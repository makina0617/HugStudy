package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UpdateEntity;
import com.example.demo.form.UpdateForm;
import com.example.demo.repository.UpdateRepository;

@Service
public class UpdateService {
	
	@Autowired
	   private UpdateRepository updateRepository;
	
	public UpdateEntity findById(Integer id) {
	       return updateRepository.getOne(id);
	   }
	public void update(UpdateForm updateUpdateRequest) {
	       UpdateEntity update = findById(updateUpdateRequest.getId());
	       update.setId(updateUpdateRequest.getId());
	       update.setName(updateUpdateRequest.getName());
	       update.setColor(updateUpdateRequest.getColor());
	       update.setSize_l(updateUpdateRequest.getSize_l());
	       update.setSize_m(updateUpdateRequest.getSize_m());
	       update.setCreate_date(updateUpdateRequest.getCreate_date());
	       updateRepository.save(update);
	   }
	
	public void delete(Integer id) {
		UpdateEntity delete = findById(id);
		updateRepository.delete(delete);
	}
}
