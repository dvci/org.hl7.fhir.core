package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Tue, Dec 13, 2022 17:53+1100 for FHIR vcurrent

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 */
@ResourceDef(name="ImmunizationRecommendation", profile="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation")
public class ImmunizationRecommendation extends DomainResource {

    @Block()
    public static class ImmunizationRecommendationRecommendationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Vaccine(s) or vaccine group that pertain to the recommendation.
         */
        @Child(name = "vaccineCode", type = {CodeableConcept.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Vaccine  or vaccine group recommendation applies to", formalDefinition="Vaccine(s) or vaccine group that pertain to the recommendation." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/vaccine-code")
        protected List<CodeableConcept> vaccineCode;

        /**
         * The targeted disease for the recommendation.
         */
        @Child(name = "targetDisease", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Disease to be immunized against", formalDefinition="The targeted disease for the recommendation." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/immunization-target-disease")
        protected List<CodeableConcept> targetDisease;

        /**
         * Vaccine(s) which should not be used to fulfill the recommendation.
         */
        @Child(name = "contraindicatedVaccineCode", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Vaccine which is contraindicated to fulfill the recommendation", formalDefinition="Vaccine(s) which should not be used to fulfill the recommendation." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/vaccine-code")
        protected List<CodeableConcept> contraindicatedVaccineCode;

        /**
         * Indicates the patient status with respect to the path to immunity for the target disease.
         */
        @Child(name = "forecastStatus", type = {CodeableConcept.class}, order=4, min=1, max=1, modifier=true, summary=true)
        @Description(shortDefinition="Vaccine recommendation status", formalDefinition="Indicates the patient status with respect to the path to immunity for the target disease." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/immunization-recommendation-status")
        protected CodeableConcept forecastStatus;

        /**
         * The reason for the assigned forecast status.
         */
        @Child(name = "forecastReason", type = {CodeableConcept.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Vaccine administration status reason", formalDefinition="The reason for the assigned forecast status." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/immunization-recommendation-reason")
        protected List<CodeableConcept> forecastReason;

        /**
         * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
         */
        @Child(name = "dateCriterion", type = {}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Dates governing proposed immunization", formalDefinition="Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc." )
        protected List<ImmunizationRecommendationRecommendationDateCriterionComponent> dateCriterion;

        /**
         * Contains the description about the protocol under which the vaccine was administered.
         */
        @Child(name = "description", type = {StringType.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Protocol details", formalDefinition="Contains the description about the protocol under which the vaccine was administered." )
        protected StringType description;

        /**
         * One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        @Child(name = "series", type = {StringType.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Name of vaccination series", formalDefinition="One possible path to achieve presumed immunity against a disease - within the context of an authority." )
        protected StringType series;

        /**
         * Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).
         */
        @Child(name = "doseNumber", type = {StringType.class}, order=9, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Recommended dose number within series", formalDefinition="Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose)." )
        protected StringType doseNumber;

        /**
         * The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.
         */
        @Child(name = "seriesDoses", type = {StringType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Recommended number of doses for immunity", formalDefinition="The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process." )
        protected StringType seriesDoses;

        /**
         * Immunization event history and/or evaluation that supports the status and recommendation.
         */
        @Child(name = "supportingImmunization", type = {Immunization.class, ImmunizationEvaluation.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Past immunizations supporting recommendation", formalDefinition="Immunization event history and/or evaluation that supports the status and recommendation." )
        protected List<Reference> supportingImmunization;

        /**
         * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
         */
        @Child(name = "supportingPatientInformation", type = {Reference.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Patient observations supporting recommendation", formalDefinition="Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information." )
        protected List<Reference> supportingPatientInformation;

        private static final long serialVersionUID = 1333936348L;

    /**
     * Constructor
     */
      public ImmunizationRecommendationRecommendationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ImmunizationRecommendationRecommendationComponent(CodeableConcept forecastStatus) {
        super();
        this.setForecastStatus(forecastStatus);
      }

        /**
         * @return {@link #vaccineCode} (Vaccine(s) or vaccine group that pertain to the recommendation.)
         */
        public List<CodeableConcept> getVaccineCode() { 
          if (this.vaccineCode == null)
            this.vaccineCode = new ArrayList<CodeableConcept>();
          return this.vaccineCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setVaccineCode(List<CodeableConcept> theVaccineCode) { 
          this.vaccineCode = theVaccineCode;
          return this;
        }

        public boolean hasVaccineCode() { 
          if (this.vaccineCode == null)
            return false;
          for (CodeableConcept item : this.vaccineCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addVaccineCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.vaccineCode == null)
            this.vaccineCode = new ArrayList<CodeableConcept>();
          this.vaccineCode.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addVaccineCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.vaccineCode == null)
            this.vaccineCode = new ArrayList<CodeableConcept>();
          this.vaccineCode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #vaccineCode}, creating it if it does not already exist {3}
         */
        public CodeableConcept getVaccineCodeFirstRep() { 
          if (getVaccineCode().isEmpty()) {
            addVaccineCode();
          }
          return getVaccineCode().get(0);
        }

        /**
         * @return {@link #targetDisease} (The targeted disease for the recommendation.)
         */
        public List<CodeableConcept> getTargetDisease() { 
          if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
          return this.targetDisease;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setTargetDisease(List<CodeableConcept> theTargetDisease) { 
          this.targetDisease = theTargetDisease;
          return this;
        }

        public boolean hasTargetDisease() { 
          if (this.targetDisease == null)
            return false;
          for (CodeableConcept item : this.targetDisease)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addTargetDisease() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
          this.targetDisease.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addTargetDisease(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.targetDisease == null)
            this.targetDisease = new ArrayList<CodeableConcept>();
          this.targetDisease.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #targetDisease}, creating it if it does not already exist {3}
         */
        public CodeableConcept getTargetDiseaseFirstRep() { 
          if (getTargetDisease().isEmpty()) {
            addTargetDisease();
          }
          return getTargetDisease().get(0);
        }

        /**
         * @return {@link #contraindicatedVaccineCode} (Vaccine(s) which should not be used to fulfill the recommendation.)
         */
        public List<CodeableConcept> getContraindicatedVaccineCode() { 
          if (this.contraindicatedVaccineCode == null)
            this.contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
          return this.contraindicatedVaccineCode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setContraindicatedVaccineCode(List<CodeableConcept> theContraindicatedVaccineCode) { 
          this.contraindicatedVaccineCode = theContraindicatedVaccineCode;
          return this;
        }

        public boolean hasContraindicatedVaccineCode() { 
          if (this.contraindicatedVaccineCode == null)
            return false;
          for (CodeableConcept item : this.contraindicatedVaccineCode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addContraindicatedVaccineCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.contraindicatedVaccineCode == null)
            this.contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
          this.contraindicatedVaccineCode.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addContraindicatedVaccineCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.contraindicatedVaccineCode == null)
            this.contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
          this.contraindicatedVaccineCode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #contraindicatedVaccineCode}, creating it if it does not already exist {3}
         */
        public CodeableConcept getContraindicatedVaccineCodeFirstRep() { 
          if (getContraindicatedVaccineCode().isEmpty()) {
            addContraindicatedVaccineCode();
          }
          return getContraindicatedVaccineCode().get(0);
        }

        /**
         * @return {@link #forecastStatus} (Indicates the patient status with respect to the path to immunity for the target disease.)
         */
        public CodeableConcept getForecastStatus() { 
          if (this.forecastStatus == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.forecastStatus");
            else if (Configuration.doAutoCreate())
              this.forecastStatus = new CodeableConcept(); // cc
          return this.forecastStatus;
        }

        public boolean hasForecastStatus() { 
          return this.forecastStatus != null && !this.forecastStatus.isEmpty();
        }

        /**
         * @param value {@link #forecastStatus} (Indicates the patient status with respect to the path to immunity for the target disease.)
         */
        public ImmunizationRecommendationRecommendationComponent setForecastStatus(CodeableConcept value) { 
          this.forecastStatus = value;
          return this;
        }

        /**
         * @return {@link #forecastReason} (The reason for the assigned forecast status.)
         */
        public List<CodeableConcept> getForecastReason() { 
          if (this.forecastReason == null)
            this.forecastReason = new ArrayList<CodeableConcept>();
          return this.forecastReason;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setForecastReason(List<CodeableConcept> theForecastReason) { 
          this.forecastReason = theForecastReason;
          return this;
        }

        public boolean hasForecastReason() { 
          if (this.forecastReason == null)
            return false;
          for (CodeableConcept item : this.forecastReason)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addForecastReason() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.forecastReason == null)
            this.forecastReason = new ArrayList<CodeableConcept>();
          this.forecastReason.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addForecastReason(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.forecastReason == null)
            this.forecastReason = new ArrayList<CodeableConcept>();
          this.forecastReason.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #forecastReason}, creating it if it does not already exist {3}
         */
        public CodeableConcept getForecastReasonFirstRep() { 
          if (getForecastReason().isEmpty()) {
            addForecastReason();
          }
          return getForecastReason().get(0);
        }

        /**
         * @return {@link #dateCriterion} (Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.)
         */
        public List<ImmunizationRecommendationRecommendationDateCriterionComponent> getDateCriterion() { 
          if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
          return this.dateCriterion;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setDateCriterion(List<ImmunizationRecommendationRecommendationDateCriterionComponent> theDateCriterion) { 
          this.dateCriterion = theDateCriterion;
          return this;
        }

        public boolean hasDateCriterion() { 
          if (this.dateCriterion == null)
            return false;
          for (ImmunizationRecommendationRecommendationDateCriterionComponent item : this.dateCriterion)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ImmunizationRecommendationRecommendationDateCriterionComponent addDateCriterion() { //3
          ImmunizationRecommendationRecommendationDateCriterionComponent t = new ImmunizationRecommendationRecommendationDateCriterionComponent();
          if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
          this.dateCriterion.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addDateCriterion(ImmunizationRecommendationRecommendationDateCriterionComponent t) { //3
          if (t == null)
            return this;
          if (this.dateCriterion == null)
            this.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
          this.dateCriterion.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #dateCriterion}, creating it if it does not already exist {3}
         */
        public ImmunizationRecommendationRecommendationDateCriterionComponent getDateCriterionFirstRep() { 
          if (getDateCriterion().isEmpty()) {
            addDateCriterion();
          }
          return getDateCriterion().get(0);
        }

        /**
         * @return {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Contains the description about the protocol under which the vaccine was administered.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ImmunizationRecommendationRecommendationComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Contains the description about the protocol under which the vaccine was administered.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Contains the description about the protocol under which the vaccine was administered.
         */
        public ImmunizationRecommendationRecommendationComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
         */
        public StringType getSeriesElement() { 
          if (this.series == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.series");
            else if (Configuration.doAutoCreate())
              this.series = new StringType(); // bb
          return this.series;
        }

        public boolean hasSeriesElement() { 
          return this.series != null && !this.series.isEmpty();
        }

        public boolean hasSeries() { 
          return this.series != null && !this.series.isEmpty();
        }

        /**
         * @param value {@link #series} (One possible path to achieve presumed immunity against a disease - within the context of an authority.). This is the underlying object with id, value and extensions. The accessor "getSeries" gives direct access to the value
         */
        public ImmunizationRecommendationRecommendationComponent setSeriesElement(StringType value) { 
          this.series = value;
          return this;
        }

        /**
         * @return One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        public String getSeries() { 
          return this.series == null ? null : this.series.getValue();
        }

        /**
         * @param value One possible path to achieve presumed immunity against a disease - within the context of an authority.
         */
        public ImmunizationRecommendationRecommendationComponent setSeries(String value) { 
          if (Utilities.noString(value))
            this.series = null;
          else {
            if (this.series == null)
              this.series = new StringType();
            this.series.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #doseNumber} (Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).). This is the underlying object with id, value and extensions. The accessor "getDoseNumber" gives direct access to the value
         */
        public StringType getDoseNumberElement() { 
          if (this.doseNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.doseNumber");
            else if (Configuration.doAutoCreate())
              this.doseNumber = new StringType(); // bb
          return this.doseNumber;
        }

        public boolean hasDoseNumberElement() { 
          return this.doseNumber != null && !this.doseNumber.isEmpty();
        }

        public boolean hasDoseNumber() { 
          return this.doseNumber != null && !this.doseNumber.isEmpty();
        }

        /**
         * @param value {@link #doseNumber} (Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).). This is the underlying object with id, value and extensions. The accessor "getDoseNumber" gives direct access to the value
         */
        public ImmunizationRecommendationRecommendationComponent setDoseNumberElement(StringType value) { 
          this.doseNumber = value;
          return this;
        }

        /**
         * @return Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).
         */
        public String getDoseNumber() { 
          return this.doseNumber == null ? null : this.doseNumber.getValue();
        }

        /**
         * @param value Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).
         */
        public ImmunizationRecommendationRecommendationComponent setDoseNumber(String value) { 
          if (Utilities.noString(value))
            this.doseNumber = null;
          else {
            if (this.doseNumber == null)
              this.doseNumber = new StringType();
            this.doseNumber.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #seriesDoses} (The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
         */
        public StringType getSeriesDosesElement() { 
          if (this.seriesDoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationComponent.seriesDoses");
            else if (Configuration.doAutoCreate())
              this.seriesDoses = new StringType(); // bb
          return this.seriesDoses;
        }

        public boolean hasSeriesDosesElement() { 
          return this.seriesDoses != null && !this.seriesDoses.isEmpty();
        }

        public boolean hasSeriesDoses() { 
          return this.seriesDoses != null && !this.seriesDoses.isEmpty();
        }

        /**
         * @param value {@link #seriesDoses} (The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.). This is the underlying object with id, value and extensions. The accessor "getSeriesDoses" gives direct access to the value
         */
        public ImmunizationRecommendationRecommendationComponent setSeriesDosesElement(StringType value) { 
          this.seriesDoses = value;
          return this;
        }

        /**
         * @return The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.
         */
        public String getSeriesDoses() { 
          return this.seriesDoses == null ? null : this.seriesDoses.getValue();
        }

        /**
         * @param value The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.
         */
        public ImmunizationRecommendationRecommendationComponent setSeriesDoses(String value) { 
          if (Utilities.noString(value))
            this.seriesDoses = null;
          else {
            if (this.seriesDoses == null)
              this.seriesDoses = new StringType();
            this.seriesDoses.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #supportingImmunization} (Immunization event history and/or evaluation that supports the status and recommendation.)
         */
        public List<Reference> getSupportingImmunization() { 
          if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
          return this.supportingImmunization;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setSupportingImmunization(List<Reference> theSupportingImmunization) { 
          this.supportingImmunization = theSupportingImmunization;
          return this;
        }

        public boolean hasSupportingImmunization() { 
          if (this.supportingImmunization == null)
            return false;
          for (Reference item : this.supportingImmunization)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addSupportingImmunization() { //3
          Reference t = new Reference();
          if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
          this.supportingImmunization.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addSupportingImmunization(Reference t) { //3
          if (t == null)
            return this;
          if (this.supportingImmunization == null)
            this.supportingImmunization = new ArrayList<Reference>();
          this.supportingImmunization.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #supportingImmunization}, creating it if it does not already exist {3}
         */
        public Reference getSupportingImmunizationFirstRep() { 
          if (getSupportingImmunization().isEmpty()) {
            addSupportingImmunization();
          }
          return getSupportingImmunization().get(0);
        }

        /**
         * @return {@link #supportingPatientInformation} (Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.)
         */
        public List<Reference> getSupportingPatientInformation() { 
          if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
          return this.supportingPatientInformation;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ImmunizationRecommendationRecommendationComponent setSupportingPatientInformation(List<Reference> theSupportingPatientInformation) { 
          this.supportingPatientInformation = theSupportingPatientInformation;
          return this;
        }

        public boolean hasSupportingPatientInformation() { 
          if (this.supportingPatientInformation == null)
            return false;
          for (Reference item : this.supportingPatientInformation)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addSupportingPatientInformation() { //3
          Reference t = new Reference();
          if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
          this.supportingPatientInformation.add(t);
          return t;
        }

        public ImmunizationRecommendationRecommendationComponent addSupportingPatientInformation(Reference t) { //3
          if (t == null)
            return this;
          if (this.supportingPatientInformation == null)
            this.supportingPatientInformation = new ArrayList<Reference>();
          this.supportingPatientInformation.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #supportingPatientInformation}, creating it if it does not already exist {3}
         */
        public Reference getSupportingPatientInformationFirstRep() { 
          if (getSupportingPatientInformation().isEmpty()) {
            addSupportingPatientInformation();
          }
          return getSupportingPatientInformation().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("vaccineCode", "CodeableConcept", "Vaccine(s) or vaccine group that pertain to the recommendation.", 0, java.lang.Integer.MAX_VALUE, vaccineCode));
          children.add(new Property("targetDisease", "CodeableConcept", "The targeted disease for the recommendation.", 0, java.lang.Integer.MAX_VALUE, targetDisease));
          children.add(new Property("contraindicatedVaccineCode", "CodeableConcept", "Vaccine(s) which should not be used to fulfill the recommendation.", 0, java.lang.Integer.MAX_VALUE, contraindicatedVaccineCode));
          children.add(new Property("forecastStatus", "CodeableConcept", "Indicates the patient status with respect to the path to immunity for the target disease.", 0, 1, forecastStatus));
          children.add(new Property("forecastReason", "CodeableConcept", "The reason for the assigned forecast status.", 0, java.lang.Integer.MAX_VALUE, forecastReason));
          children.add(new Property("dateCriterion", "", "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.", 0, java.lang.Integer.MAX_VALUE, dateCriterion));
          children.add(new Property("description", "string", "Contains the description about the protocol under which the vaccine was administered.", 0, 1, description));
          children.add(new Property("series", "string", "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0, 1, series));
          children.add(new Property("doseNumber", "string", "Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).", 0, 1, doseNumber));
          children.add(new Property("seriesDoses", "string", "The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.", 0, 1, seriesDoses));
          children.add(new Property("supportingImmunization", "Reference(Immunization|ImmunizationEvaluation)", "Immunization event history and/or evaluation that supports the status and recommendation.", 0, java.lang.Integer.MAX_VALUE, supportingImmunization));
          children.add(new Property("supportingPatientInformation", "Reference(Any)", "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.", 0, java.lang.Integer.MAX_VALUE, supportingPatientInformation));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 664556354: /*vaccineCode*/  return new Property("vaccineCode", "CodeableConcept", "Vaccine(s) or vaccine group that pertain to the recommendation.", 0, java.lang.Integer.MAX_VALUE, vaccineCode);
          case -319593813: /*targetDisease*/  return new Property("targetDisease", "CodeableConcept", "The targeted disease for the recommendation.", 0, java.lang.Integer.MAX_VALUE, targetDisease);
          case 571105240: /*contraindicatedVaccineCode*/  return new Property("contraindicatedVaccineCode", "CodeableConcept", "Vaccine(s) which should not be used to fulfill the recommendation.", 0, java.lang.Integer.MAX_VALUE, contraindicatedVaccineCode);
          case 1904598477: /*forecastStatus*/  return new Property("forecastStatus", "CodeableConcept", "Indicates the patient status with respect to the path to immunity for the target disease.", 0, 1, forecastStatus);
          case 1862115359: /*forecastReason*/  return new Property("forecastReason", "CodeableConcept", "The reason for the assigned forecast status.", 0, java.lang.Integer.MAX_VALUE, forecastReason);
          case 2087518867: /*dateCriterion*/  return new Property("dateCriterion", "", "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.", 0, java.lang.Integer.MAX_VALUE, dateCriterion);
          case -1724546052: /*description*/  return new Property("description", "string", "Contains the description about the protocol under which the vaccine was administered.", 0, 1, description);
          case -905838985: /*series*/  return new Property("series", "string", "One possible path to achieve presumed immunity against a disease - within the context of an authority.", 0, 1, series);
          case -887709242: /*doseNumber*/  return new Property("doseNumber", "string", "Nominal position of the recommended dose in a series as determined by the evaluation and forecasting process (e.g. dose 2 is the next recommended dose).", 0, 1, doseNumber);
          case -1936727105: /*seriesDoses*/  return new Property("seriesDoses", "string", "The recommended number of doses to achieve immunity as determined by the evaluation and forecasting process.", 0, 1, seriesDoses);
          case 1171592021: /*supportingImmunization*/  return new Property("supportingImmunization", "Reference(Immunization|ImmunizationEvaluation)", "Immunization event history and/or evaluation that supports the status and recommendation.", 0, java.lang.Integer.MAX_VALUE, supportingImmunization);
          case -1234160646: /*supportingPatientInformation*/  return new Property("supportingPatientInformation", "Reference(Any)", "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.", 0, java.lang.Integer.MAX_VALUE, supportingPatientInformation);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 664556354: /*vaccineCode*/ return this.vaccineCode == null ? new Base[0] : this.vaccineCode.toArray(new Base[this.vaccineCode.size()]); // CodeableConcept
        case -319593813: /*targetDisease*/ return this.targetDisease == null ? new Base[0] : this.targetDisease.toArray(new Base[this.targetDisease.size()]); // CodeableConcept
        case 571105240: /*contraindicatedVaccineCode*/ return this.contraindicatedVaccineCode == null ? new Base[0] : this.contraindicatedVaccineCode.toArray(new Base[this.contraindicatedVaccineCode.size()]); // CodeableConcept
        case 1904598477: /*forecastStatus*/ return this.forecastStatus == null ? new Base[0] : new Base[] {this.forecastStatus}; // CodeableConcept
        case 1862115359: /*forecastReason*/ return this.forecastReason == null ? new Base[0] : this.forecastReason.toArray(new Base[this.forecastReason.size()]); // CodeableConcept
        case 2087518867: /*dateCriterion*/ return this.dateCriterion == null ? new Base[0] : this.dateCriterion.toArray(new Base[this.dateCriterion.size()]); // ImmunizationRecommendationRecommendationDateCriterionComponent
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case -905838985: /*series*/ return this.series == null ? new Base[0] : new Base[] {this.series}; // StringType
        case -887709242: /*doseNumber*/ return this.doseNumber == null ? new Base[0] : new Base[] {this.doseNumber}; // StringType
        case -1936727105: /*seriesDoses*/ return this.seriesDoses == null ? new Base[0] : new Base[] {this.seriesDoses}; // StringType
        case 1171592021: /*supportingImmunization*/ return this.supportingImmunization == null ? new Base[0] : this.supportingImmunization.toArray(new Base[this.supportingImmunization.size()]); // Reference
        case -1234160646: /*supportingPatientInformation*/ return this.supportingPatientInformation == null ? new Base[0] : this.supportingPatientInformation.toArray(new Base[this.supportingPatientInformation.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 664556354: // vaccineCode
          this.getVaccineCode().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -319593813: // targetDisease
          this.getTargetDisease().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 571105240: // contraindicatedVaccineCode
          this.getContraindicatedVaccineCode().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 1904598477: // forecastStatus
          this.forecastStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1862115359: // forecastReason
          this.getForecastReason().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 2087518867: // dateCriterion
          this.getDateCriterion().add((ImmunizationRecommendationRecommendationDateCriterionComponent) value); // ImmunizationRecommendationRecommendationDateCriterionComponent
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToString(value); // StringType
          return value;
        case -905838985: // series
          this.series = TypeConvertor.castToString(value); // StringType
          return value;
        case -887709242: // doseNumber
          this.doseNumber = TypeConvertor.castToString(value); // StringType
          return value;
        case -1936727105: // seriesDoses
          this.seriesDoses = TypeConvertor.castToString(value); // StringType
          return value;
        case 1171592021: // supportingImmunization
          this.getSupportingImmunization().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -1234160646: // supportingPatientInformation
          this.getSupportingPatientInformation().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("vaccineCode")) {
          this.getVaccineCode().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("targetDisease")) {
          this.getTargetDisease().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("contraindicatedVaccineCode")) {
          this.getContraindicatedVaccineCode().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("forecastStatus")) {
          this.forecastStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("forecastReason")) {
          this.getForecastReason().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("dateCriterion")) {
          this.getDateCriterion().add((ImmunizationRecommendationRecommendationDateCriterionComponent) value);
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("series")) {
          this.series = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("doseNumber")) {
          this.doseNumber = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("seriesDoses")) {
          this.seriesDoses = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("supportingImmunization")) {
          this.getSupportingImmunization().add(TypeConvertor.castToReference(value));
        } else if (name.equals("supportingPatientInformation")) {
          this.getSupportingPatientInformation().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 664556354:  return addVaccineCode(); 
        case -319593813:  return addTargetDisease(); 
        case 571105240:  return addContraindicatedVaccineCode(); 
        case 1904598477:  return getForecastStatus();
        case 1862115359:  return addForecastReason(); 
        case 2087518867:  return addDateCriterion(); 
        case -1724546052:  return getDescriptionElement();
        case -905838985:  return getSeriesElement();
        case -887709242:  return getDoseNumberElement();
        case -1936727105:  return getSeriesDosesElement();
        case 1171592021:  return addSupportingImmunization(); 
        case -1234160646:  return addSupportingPatientInformation(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 664556354: /*vaccineCode*/ return new String[] {"CodeableConcept"};
        case -319593813: /*targetDisease*/ return new String[] {"CodeableConcept"};
        case 571105240: /*contraindicatedVaccineCode*/ return new String[] {"CodeableConcept"};
        case 1904598477: /*forecastStatus*/ return new String[] {"CodeableConcept"};
        case 1862115359: /*forecastReason*/ return new String[] {"CodeableConcept"};
        case 2087518867: /*dateCriterion*/ return new String[] {};
        case -1724546052: /*description*/ return new String[] {"string"};
        case -905838985: /*series*/ return new String[] {"string"};
        case -887709242: /*doseNumber*/ return new String[] {"string"};
        case -1936727105: /*seriesDoses*/ return new String[] {"string"};
        case 1171592021: /*supportingImmunization*/ return new String[] {"Reference"};
        case -1234160646: /*supportingPatientInformation*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("vaccineCode")) {
          return addVaccineCode();
        }
        else if (name.equals("targetDisease")) {
          return addTargetDisease();
        }
        else if (name.equals("contraindicatedVaccineCode")) {
          return addContraindicatedVaccineCode();
        }
        else if (name.equals("forecastStatus")) {
          this.forecastStatus = new CodeableConcept();
          return this.forecastStatus;
        }
        else if (name.equals("forecastReason")) {
          return addForecastReason();
        }
        else if (name.equals("dateCriterion")) {
          return addDateCriterion();
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.recommendation.description");
        }
        else if (name.equals("series")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.recommendation.series");
        }
        else if (name.equals("doseNumber")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.recommendation.doseNumber");
        }
        else if (name.equals("seriesDoses")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.recommendation.seriesDoses");
        }
        else if (name.equals("supportingImmunization")) {
          return addSupportingImmunization();
        }
        else if (name.equals("supportingPatientInformation")) {
          return addSupportingPatientInformation();
        }
        else
          return super.addChild(name);
      }

      public ImmunizationRecommendationRecommendationComponent copy() {
        ImmunizationRecommendationRecommendationComponent dst = new ImmunizationRecommendationRecommendationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ImmunizationRecommendationRecommendationComponent dst) {
        super.copyValues(dst);
        if (vaccineCode != null) {
          dst.vaccineCode = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : vaccineCode)
            dst.vaccineCode.add(i.copy());
        };
        if (targetDisease != null) {
          dst.targetDisease = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : targetDisease)
            dst.targetDisease.add(i.copy());
        };
        if (contraindicatedVaccineCode != null) {
          dst.contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : contraindicatedVaccineCode)
            dst.contraindicatedVaccineCode.add(i.copy());
        };
        dst.forecastStatus = forecastStatus == null ? null : forecastStatus.copy();
        if (forecastReason != null) {
          dst.forecastReason = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : forecastReason)
            dst.forecastReason.add(i.copy());
        };
        if (dateCriterion != null) {
          dst.dateCriterion = new ArrayList<ImmunizationRecommendationRecommendationDateCriterionComponent>();
          for (ImmunizationRecommendationRecommendationDateCriterionComponent i : dateCriterion)
            dst.dateCriterion.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        dst.series = series == null ? null : series.copy();
        dst.doseNumber = doseNumber == null ? null : doseNumber.copy();
        dst.seriesDoses = seriesDoses == null ? null : seriesDoses.copy();
        if (supportingImmunization != null) {
          dst.supportingImmunization = new ArrayList<Reference>();
          for (Reference i : supportingImmunization)
            dst.supportingImmunization.add(i.copy());
        };
        if (supportingPatientInformation != null) {
          dst.supportingPatientInformation = new ArrayList<Reference>();
          for (Reference i : supportingPatientInformation)
            dst.supportingPatientInformation.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendationRecommendationComponent))
          return false;
        ImmunizationRecommendationRecommendationComponent o = (ImmunizationRecommendationRecommendationComponent) other_;
        return compareDeep(vaccineCode, o.vaccineCode, true) && compareDeep(targetDisease, o.targetDisease, true)
           && compareDeep(contraindicatedVaccineCode, o.contraindicatedVaccineCode, true) && compareDeep(forecastStatus, o.forecastStatus, true)
           && compareDeep(forecastReason, o.forecastReason, true) && compareDeep(dateCriterion, o.dateCriterion, true)
           && compareDeep(description, o.description, true) && compareDeep(series, o.series, true) && compareDeep(doseNumber, o.doseNumber, true)
           && compareDeep(seriesDoses, o.seriesDoses, true) && compareDeep(supportingImmunization, o.supportingImmunization, true)
           && compareDeep(supportingPatientInformation, o.supportingPatientInformation, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendationRecommendationComponent))
          return false;
        ImmunizationRecommendationRecommendationComponent o = (ImmunizationRecommendationRecommendationComponent) other_;
        return compareValues(description, o.description, true) && compareValues(series, o.series, true) && compareValues(doseNumber, o.doseNumber, true)
           && compareValues(seriesDoses, o.seriesDoses, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(vaccineCode, targetDisease
          , contraindicatedVaccineCode, forecastStatus, forecastReason, dateCriterion, description
          , series, doseNumber, seriesDoses, supportingImmunization, supportingPatientInformation
          );
      }

  public String fhirType() {
    return "ImmunizationRecommendation.recommendation";

  }

  }

    @Block()
    public static class ImmunizationRecommendationRecommendationDateCriterionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of date", formalDefinition="Date classification of recommendation.  For example, earliest date to give, latest date to give, etc." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/immunization-recommendation-date-criterion")
        protected CodeableConcept code;

        /**
         * The date whose meaning is specified by dateCriterion.code.
         */
        @Child(name = "value", type = {DateTimeType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Recommended date", formalDefinition="The date whose meaning is specified by dateCriterion.code." )
        protected DateTimeType value;

        private static final long serialVersionUID = 1036994566L;

    /**
     * Constructor
     */
      public ImmunizationRecommendationRecommendationDateCriterionComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ImmunizationRecommendationRecommendationDateCriterionComponent(CodeableConcept code, Date value) {
        super();
        this.setCode(code);
        this.setValue(value);
      }

        /**
         * @return {@link #code} (Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationDateCriterionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.)
         */
        public ImmunizationRecommendationRecommendationDateCriterionComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #value} (The date whose meaning is specified by dateCriterion.code.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public DateTimeType getValueElement() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ImmunizationRecommendationRecommendationDateCriterionComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new DateTimeType(); // bb
          return this.value;
        }

        public boolean hasValueElement() { 
          return this.value != null && !this.value.isEmpty();
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The date whose meaning is specified by dateCriterion.code.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public ImmunizationRecommendationRecommendationDateCriterionComponent setValueElement(DateTimeType value) { 
          this.value = value;
          return this;
        }

        /**
         * @return The date whose meaning is specified by dateCriterion.code.
         */
        public Date getValue() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value The date whose meaning is specified by dateCriterion.code.
         */
        public ImmunizationRecommendationRecommendationDateCriterionComponent setValue(Date value) { 
            if (this.value == null)
              this.value = new DateTimeType();
            this.value.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.", 0, 1, code));
          children.add(new Property("value", "dateTime", "The date whose meaning is specified by dateCriterion.code.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.", 0, 1, code);
          case 111972721: /*value*/  return new Property("value", "dateTime", "The date whose meaning is specified by dateCriterion.code.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DateTimeType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value")) {
          this.value = TypeConvertor.castToDateTime(value); // DateTimeType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode();
        case 111972721:  return getValueElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"dateTime"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.recommendation.dateCriterion.value");
        }
        else
          return super.addChild(name);
      }

      public ImmunizationRecommendationRecommendationDateCriterionComponent copy() {
        ImmunizationRecommendationRecommendationDateCriterionComponent dst = new ImmunizationRecommendationRecommendationDateCriterionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ImmunizationRecommendationRecommendationDateCriterionComponent dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendationRecommendationDateCriterionComponent))
          return false;
        ImmunizationRecommendationRecommendationDateCriterionComponent o = (ImmunizationRecommendationRecommendationDateCriterionComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendationRecommendationDateCriterionComponent))
          return false;
        ImmunizationRecommendationRecommendationDateCriterionComponent o = (ImmunizationRecommendationRecommendationDateCriterionComponent) other_;
        return compareValues(value, o.value, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, value);
      }

  public String fhirType() {
    return "ImmunizationRecommendation.recommendation.dateCriterion";

  }

  }

    /**
     * A unique identifier assigned to this particular recommendation record.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business identifier", formalDefinition="A unique identifier assigned to this particular recommendation record." )
    protected List<Identifier> identifier;

    /**
     * The patient the recommendation(s) are for.
     */
    @Child(name = "patient", type = {Patient.class}, order=1, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who this profile is for", formalDefinition="The patient the recommendation(s) are for." )
    protected Reference patient;

    /**
     * The date the immunization recommendation(s) were created.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=2, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Date recommendation(s) created", formalDefinition="The date the immunization recommendation(s) were created." )
    protected DateTimeType date;

    /**
     * Indicates the authority who published the protocol (e.g. ACIP).
     */
    @Child(name = "authority", type = {Organization.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Who is responsible for protocol", formalDefinition="Indicates the authority who published the protocol (e.g. ACIP)." )
    protected Reference authority;

    /**
     * Vaccine administration recommendations.
     */
    @Child(name = "recommendation", type = {}, order=4, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Vaccine administration recommendations", formalDefinition="Vaccine administration recommendations." )
    protected List<ImmunizationRecommendationRecommendationComponent> recommendation;

    private static final long serialVersionUID = 534427937L;

  /**
   * Constructor
   */
    public ImmunizationRecommendation() {
      super();
    }

  /**
   * Constructor
   */
    public ImmunizationRecommendation(Reference patient, Date date, ImmunizationRecommendationRecommendationComponent recommendation) {
      super();
      this.setPatient(patient);
      this.setDate(date);
      this.addRecommendation(recommendation);
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this particular recommendation record.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImmunizationRecommendation setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public ImmunizationRecommendation addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #patient} (The patient the recommendation(s) are for.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationRecommendation.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The patient the recommendation(s) are for.)
     */
    public ImmunizationRecommendation setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #date} (The date the immunization recommendation(s) were created.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationRecommendation.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date the immunization recommendation(s) were created.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ImmunizationRecommendation setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date the immunization recommendation(s) were created.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date the immunization recommendation(s) were created.
     */
    public ImmunizationRecommendation setDate(Date value) { 
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      return this;
    }

    /**
     * @return {@link #authority} (Indicates the authority who published the protocol (e.g. ACIP).)
     */
    public Reference getAuthority() { 
      if (this.authority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ImmunizationRecommendation.authority");
        else if (Configuration.doAutoCreate())
          this.authority = new Reference(); // cc
      return this.authority;
    }

    public boolean hasAuthority() { 
      return this.authority != null && !this.authority.isEmpty();
    }

    /**
     * @param value {@link #authority} (Indicates the authority who published the protocol (e.g. ACIP).)
     */
    public ImmunizationRecommendation setAuthority(Reference value) { 
      this.authority = value;
      return this;
    }

    /**
     * @return {@link #recommendation} (Vaccine administration recommendations.)
     */
    public List<ImmunizationRecommendationRecommendationComponent> getRecommendation() { 
      if (this.recommendation == null)
        this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
      return this.recommendation;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ImmunizationRecommendation setRecommendation(List<ImmunizationRecommendationRecommendationComponent> theRecommendation) { 
      this.recommendation = theRecommendation;
      return this;
    }

    public boolean hasRecommendation() { 
      if (this.recommendation == null)
        return false;
      for (ImmunizationRecommendationRecommendationComponent item : this.recommendation)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ImmunizationRecommendationRecommendationComponent addRecommendation() { //3
      ImmunizationRecommendationRecommendationComponent t = new ImmunizationRecommendationRecommendationComponent();
      if (this.recommendation == null)
        this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
      this.recommendation.add(t);
      return t;
    }

    public ImmunizationRecommendation addRecommendation(ImmunizationRecommendationRecommendationComponent t) { //3
      if (t == null)
        return this;
      if (this.recommendation == null)
        this.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
      this.recommendation.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #recommendation}, creating it if it does not already exist {3}
     */
    public ImmunizationRecommendationRecommendationComponent getRecommendationFirstRep() { 
      if (getRecommendation().isEmpty()) {
        addRecommendation();
      }
      return getRecommendation().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A unique identifier assigned to this particular recommendation record.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("patient", "Reference(Patient)", "The patient the recommendation(s) are for.", 0, 1, patient));
        children.add(new Property("date", "dateTime", "The date the immunization recommendation(s) were created.", 0, 1, date));
        children.add(new Property("authority", "Reference(Organization)", "Indicates the authority who published the protocol (e.g. ACIP).", 0, 1, authority));
        children.add(new Property("recommendation", "", "Vaccine administration recommendations.", 0, java.lang.Integer.MAX_VALUE, recommendation));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A unique identifier assigned to this particular recommendation record.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -791418107: /*patient*/  return new Property("patient", "Reference(Patient)", "The patient the recommendation(s) are for.", 0, 1, patient);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date the immunization recommendation(s) were created.", 0, 1, date);
        case 1475610435: /*authority*/  return new Property("authority", "Reference(Organization)", "Indicates the authority who published the protocol (e.g. ACIP).", 0, 1, authority);
        case -1028636743: /*recommendation*/  return new Property("recommendation", "", "Vaccine administration recommendations.", 0, java.lang.Integer.MAX_VALUE, recommendation);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -791418107: /*patient*/ return this.patient == null ? new Base[0] : new Base[] {this.patient}; // Reference
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case 1475610435: /*authority*/ return this.authority == null ? new Base[0] : new Base[] {this.authority}; // Reference
        case -1028636743: /*recommendation*/ return this.recommendation == null ? new Base[0] : this.recommendation.toArray(new Base[this.recommendation.size()]); // ImmunizationRecommendationRecommendationComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -791418107: // patient
          this.patient = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 1475610435: // authority
          this.authority = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1028636743: // recommendation
          this.getRecommendation().add((ImmunizationRecommendationRecommendationComponent) value); // ImmunizationRecommendationRecommendationComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("patient")) {
          this.patient = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("authority")) {
          this.authority = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("recommendation")) {
          this.getRecommendation().add((ImmunizationRecommendationRecommendationComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -791418107:  return getPatient();
        case 3076014:  return getDateElement();
        case 1475610435:  return getAuthority();
        case -1028636743:  return addRecommendation(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -791418107: /*patient*/ return new String[] {"Reference"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case 1475610435: /*authority*/ return new String[] {"Reference"};
        case -1028636743: /*recommendation*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("patient")) {
          this.patient = new Reference();
          return this.patient;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type ImmunizationRecommendation.date");
        }
        else if (name.equals("authority")) {
          this.authority = new Reference();
          return this.authority;
        }
        else if (name.equals("recommendation")) {
          return addRecommendation();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "ImmunizationRecommendation";

  }

      public ImmunizationRecommendation copy() {
        ImmunizationRecommendation dst = new ImmunizationRecommendation();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ImmunizationRecommendation dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.patient = patient == null ? null : patient.copy();
        dst.date = date == null ? null : date.copy();
        dst.authority = authority == null ? null : authority.copy();
        if (recommendation != null) {
          dst.recommendation = new ArrayList<ImmunizationRecommendationRecommendationComponent>();
          for (ImmunizationRecommendationRecommendationComponent i : recommendation)
            dst.recommendation.add(i.copy());
        };
      }

      protected ImmunizationRecommendation typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendation))
          return false;
        ImmunizationRecommendation o = (ImmunizationRecommendation) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(patient, o.patient, true) && compareDeep(date, o.date, true)
           && compareDeep(authority, o.authority, true) && compareDeep(recommendation, o.recommendation, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ImmunizationRecommendation))
          return false;
        ImmunizationRecommendation o = (ImmunizationRecommendation) other_;
        return compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, patient, date
          , authority, recommendation);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ImmunizationRecommendation;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Date recommendation(s) created</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImmunizationRecommendation.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="ImmunizationRecommendation.date", description="Date recommendation(s) created", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Date recommendation(s) created</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ImmunizationRecommendation.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="ImmunizationRecommendation.identifier", description="Business identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Business identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>information</b>
   * <p>
   * Description: <b>Patient observations supporting recommendation</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.supportingPatientInformation</b><br>
   * </p>
   */
  @SearchParamDefinition(name="information", path="ImmunizationRecommendation.recommendation.supportingPatientInformation", description="Patient observations supporting recommendation", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceDispense.class, DeviceMetric.class, DeviceRequest.class, DeviceUsage.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceReport.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, FormularyItem.class, GenomicStudy.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InventoryReport.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, Transport.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_INFORMATION = "information";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>information</b>
   * <p>
   * Description: <b>Patient observations supporting recommendation</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.supportingPatientInformation</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam INFORMATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_INFORMATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImmunizationRecommendation:information</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_INFORMATION = new ca.uhn.fhir.model.api.Include("ImmunizationRecommendation:information").toLocked();

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Who this profile is for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="ImmunizationRecommendation.patient", description="Who this profile is for", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Who this profile is for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImmunizationRecommendation:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("ImmunizationRecommendation:patient").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Vaccine recommendation status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.forecastStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="ImmunizationRecommendation.recommendation.forecastStatus", description="Vaccine recommendation status", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Vaccine recommendation status</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.forecastStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>support</b>
   * <p>
   * Description: <b>Past immunizations supporting recommendation</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.supportingImmunization</b><br>
   * </p>
   */
  @SearchParamDefinition(name="support", path="ImmunizationRecommendation.recommendation.supportingImmunization", description="Past immunizations supporting recommendation", type="reference", target={Immunization.class, ImmunizationEvaluation.class } )
  public static final String SP_SUPPORT = "support";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>support</b>
   * <p>
   * Description: <b>Past immunizations supporting recommendation</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.supportingImmunization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUPPORT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUPPORT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ImmunizationRecommendation:support</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUPPORT = new ca.uhn.fhir.model.api.Include("ImmunizationRecommendation:support").toLocked();

 /**
   * Search parameter: <b>target-disease</b>
   * <p>
   * Description: <b>Disease to be immunized against</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.targetDisease</b><br>
   * </p>
   */
  @SearchParamDefinition(name="target-disease", path="ImmunizationRecommendation.recommendation.targetDisease", description="Disease to be immunized against", type="token" )
  public static final String SP_TARGET_DISEASE = "target-disease";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>target-disease</b>
   * <p>
   * Description: <b>Disease to be immunized against</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.targetDisease</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TARGET_DISEASE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TARGET_DISEASE);

 /**
   * Search parameter: <b>vaccine-type</b>
   * <p>
   * Description: <b>Vaccine  or vaccine group recommendation applies to</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.vaccineCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name="vaccine-type", path="ImmunizationRecommendation.recommendation.vaccineCode", description="Vaccine  or vaccine group recommendation applies to", type="token" )
  public static final String SP_VACCINE_TYPE = "vaccine-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>vaccine-type</b>
   * <p>
   * Description: <b>Vaccine  or vaccine group recommendation applies to</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ImmunizationRecommendation.recommendation.vaccineCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VACCINE_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VACCINE_TYPE);


}

