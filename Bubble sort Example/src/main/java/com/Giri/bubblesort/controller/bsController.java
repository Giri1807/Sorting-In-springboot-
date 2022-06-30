package com.Giri.bubblesort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Giri.Selectionsort.Selectionservice.SsService;
import com.Giri.bubblesort.service.bsService;

@RestController
public class bsController {

	@Autowired
	bsService bsservice;
	SsService ssservice;

	@GetMapping("/bubblesort")
	public int[] run(@RequestBody int[] array) {
		bsservice.bubblesort(array);
		return array;
	}

	@GetMapping("/Selectionsort")
	public int[] ssort(@RequestBody int[] arr) {
		ssservice.selectionSort(arr);
		return arr;

}
}