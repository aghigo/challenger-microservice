package com.javachallengers.simpson.model.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

@ApiModel(value = "SimpsonCharacterRequestDTO", description = "Default model of a simpson character")
@Getter
@Builder
public final class SimpsonCharacterRequestDTO implements Serializable {
	private static final long serialVersionUID = 8840536784759714847L;

	@ApiModelProperty(value = "id", required = false, example = "1")
	@JsonInclude(Include.NON_NULL)
	private String id;

	@ApiModelProperty(value = "name", required = true, example = "Homer")
	@NotEmpty(message = "Name cannot be empty")
	private final String name;
	
	@ApiModelProperty(value = "surname", required = true, example = "Simpson")
	@NotEmpty(message = "Surname cannot be empty")
	private final String surname;
	
	@ApiModelProperty(value = "birthDate", required = true, example = "1980-12-03")
	@NotNull(message = "Birth date cannot be null")
	@Past(message = "Birth date must be in the past")
	private final LocalDate birthDate;
	
	@ApiModelProperty(value = "city", required = true, example = "Springfield")
	@NotEmpty(message = "City cannot be empty")
	private final String city;
	
	@ApiModelProperty(value = "country", required = true, example = "United States")
	@NotEmpty(message = "Country cannot be empty")
	private final String country;
}
