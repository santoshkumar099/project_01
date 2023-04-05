package com.cts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.EPICs;
import com.cts.service.EPICsService;

@RestController
@RequestMapping("/productbacklog")
public class EpicController {

		@Autowired
		private EPICsService epicService;
		
		@PostMapping("/create")
		public ResponseEntity<String> addEpic(@RequestBody EPICs epic) {
		String result = epicService.addEpic(epic);
		ResponseEntity<String> res= new ResponseEntity<>(result,HttpStatus.CREATED);
		return res;

		}

	}


