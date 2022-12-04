package com.team.bloodseva.controller;

import java.util.WeakHashMap;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.bloodseva.dao.RestApiDao;
import com.team.bloodseva.modal.RequestModal;
import com.team.bloodseva.modal.UserModal;

@RestController
@RequestMapping("/rest")
public class RestApiController {
	
	@Autowired
	RestApiDao restApiDao;
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_district", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getDistrict(){
		return restApiDao.getDistrict();
		
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_taluka", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getTaluka(@PathParam("id") int id){
		return restApiDao.getTaluka(id);
		
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_role", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getRole(){
		return restApiDao.getRole();
		
	}
	
	@SuppressWarnings({ "rawtypes"})
	@GetMapping(path = "/get_gender", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getGender(){
		return restApiDao.getGender();	
	}
	
	@SuppressWarnings({ "rawtypes"})
	@GetMapping(path = "/get_blood_grpup", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getBloodGrpup(){
		return restApiDao.getBloodGrpup();	
	}
	
	@SuppressWarnings({ "rawtypes"})
	@GetMapping(path = "/get_blood_stock", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getBloodStock(){
		return restApiDao.getBloodStock();	
	}
	
	@SuppressWarnings({ "rawtypes"})
	@PostMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getSearch(@RequestBody UserModal userModal){
		return restApiDao.getSearch(userModal);	
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/add_request", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap addRequest(@RequestBody RequestModal requestModal){
		return restApiDao.addRequest(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_request_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getRequestList(@RequestBody RequestModal requestModal){
		return restApiDao.getRequestList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_request_history_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getRequestHistoryList(@RequestBody RequestModal requestModal){
		return restApiDao.getRequestHistoryList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/update_request", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap updateRequest(@RequestBody RequestModal requestModal){
		return restApiDao.updateRequest(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_all_request_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllRequestList(@RequestBody RequestModal requestModal){
		return restApiDao.getAllRequestList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_all_request_history_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllRequestHistoryList(@RequestBody RequestModal requestModal){
		return restApiDao.getAllRequestHistoryList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_blood_bank_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getBloodBankList(){
		return restApiDao.getBloodBankList();
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_all_stock_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllStockList(@RequestBody RequestModal requestModal){
		return restApiDao.getAllStockList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/update_stock", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap updateStock(@RequestBody RequestModal requestModal){
		return restApiDao.updateStock(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/add_campaign_request", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap addCampaignRequest(@RequestBody RequestModal requestModal){
		return restApiDao.addCampaignRequest(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/update_campaign_request", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap updateCampaignRequest(@RequestBody RequestModal requestModal){
		return restApiDao.updateCampaignRequest(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_campaign_request_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getCampaignRequestList(@RequestBody RequestModal requestModal){
		return restApiDao.getCampaignRequestList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_campaign_request_history_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getCampaignRequestHistoryList(@RequestBody RequestModal requestModal){
		return restApiDao.getCampaignRequestHistoryList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_all_campaign_request_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllCampaignRequestList(@RequestBody RequestModal requestModal){
		return restApiDao.getAllCampaignRequestList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/get_all_campaign_request_history_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllCampaignRequestHistoryList(@RequestBody RequestModal requestModal){
		return restApiDao.getAllCampaignRequestHistoryList(requestModal);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_all_request_status_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllRequestStatusList(){
		return restApiDao.getAllRequestStatusList();
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_all_campaign_request_status_list", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllCampaignRequestStatusList(){
		return restApiDao.getAllCampaignRequestStatusList();
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/get_all_stock_list_bank_wise", produces = MediaType.APPLICATION_JSON_VALUE)
	public WeakHashMap getAllStockListBankWise(){
		return restApiDao.getAllStockListBankWise();
	}
}
