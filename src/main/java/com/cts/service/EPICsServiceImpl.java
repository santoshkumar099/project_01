package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.EPICs;
import com.cts.repository.EPICsRepository;
@Service

public class EPICsServiceImpl implements EPICsService {
	@Autowired
	private EPICsRepository epicRepository;
	/*@Override
	public String addEpic(EPICs epic) {
	epicRepository.save(epic);
	return "EPIC is added successfully";*/

	public String addEpic(EPICs epic) {
		epicRepository.save(epic);
		return "EPIC is added successfully";
	}
		
}
