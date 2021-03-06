package com.nwjon.mvc.data.entities;

import java.math.BigDecimal;
import java.util.Arrays;

public class Resource {

	private Long resourceId;

	private String name;

	private String type;

	private BigDecimal cost;

	private String unitOfMeasure;

	private String[] indicators;

	private String notes;

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String[] getIndicators() {
		return indicators;
	}

	public void setIndicators(String[] indicators) {
		this.indicators = indicators;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("Resource{").append("resourceId=").append(resourceId).append(", name='").append(name).append('\'').append(", type='").append(type).append('\'').append(", cost=").append(cost).append(", unitOfMeasure='").append(unitOfMeasure).append('\'').append(", indicators=").append(Arrays.toString(indicators)).append(", notes='").append(notes).append('\'').append('}').toString();
	}

}
