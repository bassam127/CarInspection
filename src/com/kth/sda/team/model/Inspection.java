package com.kth.sda.team.model;
import java.util.ArrayList;
import java.util.List;

import com.kth.sda.team.integration.InspectionCheckListDTO;
import com.kth.sda.team.integration.InspectionDTO;

import Exception.NullInspectionException;
/**
 * 
 * @author tmpuser-10213
 *
 */
public class Inspection {


	private String licenseNumber;
	private int cost;
	private List<InspectionCheckListDTO> inspectionCheckList;
	/**
	 * Create the inspections.
	 *
	 * @param inspectionDTO
	 */
	public Inspection(InspectionDTO inspectionDTO){

		this.licenseNumber=inspectionDTO.getLicenseNumber();
		this.cost=inspectionDTO.getCost();
		inspectionCheckList = new ArrayList<>();

		addInspectionCheckList();
	}
	/**
	 *Add new inspections to the inspection list and create the database. 
	 */
	public void addInspectionCheckList(){
				InspectionCheckListDTO inspectionCheckListDto = new InspectionCheckListDTO(true,"operation1");
				InspectionCheckListDTO inspectionCheckListDto1 = new InspectionCheckListDTO(true,"operation2");
				InspectionCheckListDTO inspectionCheckListDto2 = new InspectionCheckListDTO(true,"operation3");
				InspectionCheckListDTO inspectionCheckListDto3 = new InspectionCheckListDTO(true,"operation4");
				InspectionCheckListDTO inspectionCheckListDto4 = new InspectionCheckListDTO(true,"operation5");
				InspectionCheckListDTO inspectionCheckListDto5 = new InspectionCheckListDTO(true,"operation6");
				inspectionCheckList.add(inspectionCheckListDto);
				inspectionCheckList.add(inspectionCheckListDto1);
				inspectionCheckList.add(inspectionCheckListDto2);
				inspectionCheckList.add(inspectionCheckListDto3);
				inspectionCheckList.add(inspectionCheckListDto4);
				inspectionCheckList.add(inspectionCheckListDto5);

		}
	/**
	 * Get the list of the inspections.
	 * @return inspectionCheckList The list of the inspections.
	 */
	public List<InspectionCheckListDTO> getInspectionCheckList() {
			return inspectionCheckList;
	}
	/**
	 * Set the result of the inspections.
	 * @param inspectionCheckList The list of the inspections after modifications.
	 */
	public void setInspectionCheckList(
			List<InspectionCheckListDTO> inspectionCheckList) {
		this.inspectionCheckList = inspectionCheckList;
	}
	
	
	
	





}
