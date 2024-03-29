package com.FINAL.KIP.request.controller;

import com.FINAL.KIP.request.dto.request.RequestCreateReqDto;
import com.FINAL.KIP.request.dto.response.RequestAgreeResDto;
import com.FINAL.KIP.request.dto.response.RequestCreateResDto;
import com.FINAL.KIP.request.dto.response.RequestRefuseResDto;
import com.FINAL.KIP.request.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

	private final RequestService requestService;

	@Autowired
	public RequestController(RequestService requestService) {
		this.requestService = requestService;
	}


	@GetMapping("/doc/request")
	public ResponseEntity<RequestCreateResDto> createRequest(@RequestBody RequestCreateReqDto requestCreateReqDto) {
		return requestService.createRequest(requestCreateReqDto);
	}

	@GetMapping("/doc/request/refuse/{request_id}")
	public ResponseEntity<RequestRefuseResDto> refuseRequest(@PathVariable Long request_id) {
		return requestService.refuseRequest(request_id);
	}

	@GetMapping("/doc/request/agree/{request_id}")
	public ResponseEntity<RequestAgreeResDto> agreeRequest(@PathVariable Long request_id) {
		return requestService.agreeRequest(request_id);
	}

}