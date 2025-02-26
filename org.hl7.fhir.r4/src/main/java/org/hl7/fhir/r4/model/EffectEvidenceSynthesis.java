package org.hl7.fhir.r4.model;



/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/


// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1

import java.util.*;

import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4.model.Enumerations.*;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 */
@ResourceDef(name="EffectEvidenceSynthesis", profile="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis")
@ChildOrder(names={"url", "identifier", "version", "name", "title", "status", "date", "publisher", "contact", "description", "note", "useContext", "jurisdiction", "copyright", "approvalDate", "lastReviewDate", "effectivePeriod", "topic", "author", "editor", "reviewer", "endorser", "relatedArtifact", "synthesisType", "studyType", "population", "exposure", "exposureAlternative", "outcome", "sampleSize", "resultsByExposure", "effectEstimate", "certainty"})
public class EffectEvidenceSynthesis extends MetadataResource {

    public enum ExposureState {
        /**
         * used when the results by exposure is describing the results for the primary exposure of interest.
         */
        EXPOSURE, 
        /**
         * used when the results by exposure is describing the results for the alternative exposure state, control state or comparator state.
         */
        EXPOSUREALTERNATIVE, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ExposureState fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("exposure".equals(codeString))
          return EXPOSURE;
        if ("exposure-alternative".equals(codeString))
          return EXPOSUREALTERNATIVE;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ExposureState code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case EXPOSURE: return "exposure";
            case EXPOSUREALTERNATIVE: return "exposure-alternative";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case EXPOSURE: return "http://hl7.org/fhir/exposure-state";
            case EXPOSUREALTERNATIVE: return "http://hl7.org/fhir/exposure-state";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case EXPOSURE: return "used when the results by exposure is describing the results for the primary exposure of interest.";
            case EXPOSUREALTERNATIVE: return "used when the results by exposure is describing the results for the alternative exposure state, control state or comparator state.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case EXPOSURE: return "Exposure";
            case EXPOSUREALTERNATIVE: return "Exposure Alternative";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ExposureStateEnumFactory implements EnumFactory<ExposureState> {
    public ExposureState fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("exposure".equals(codeString))
          return ExposureState.EXPOSURE;
        if ("exposure-alternative".equals(codeString))
          return ExposureState.EXPOSUREALTERNATIVE;
        throw new IllegalArgumentException("Unknown ExposureState code '"+codeString+"'");
        }
        public Enumeration<ExposureState> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ExposureState>(this, ExposureState.NULL, code);
          String codeString = code.asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ExposureState>(this, ExposureState.NULL, code);
        if ("exposure".equals(codeString))
          return new Enumeration<ExposureState>(this, ExposureState.EXPOSURE, code);
        if ("exposure-alternative".equals(codeString))
          return new Enumeration<ExposureState>(this, ExposureState.EXPOSUREALTERNATIVE, code);
        throw new FHIRException("Unknown ExposureState code '"+codeString+"'");
        }
    public String toCode(ExposureState code) {
      if (code == ExposureState.EXPOSURE)
        return "exposure";
      if (code == ExposureState.EXPOSUREALTERNATIVE)
        return "exposure-alternative";
      return "?";
      }
    public String toSystem(ExposureState code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class EffectEvidenceSynthesisSampleSizeComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of sample size.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of sample size", formalDefinition="Human-readable summary of sample size." )
        protected StringType description;

        /**
         * Number of studies included in this evidence synthesis.
         */
        @Child(name = "numberOfStudies", type = {IntegerType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How many studies?", formalDefinition="Number of studies included in this evidence synthesis." )
        protected IntegerType numberOfStudies;

        /**
         * Number of participants included in this evidence synthesis.
         */
        @Child(name = "numberOfParticipants", type = {IntegerType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How many participants?", formalDefinition="Number of participants included in this evidence synthesis." )
        protected IntegerType numberOfParticipants;

        private static final long serialVersionUID = -1116074476L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisSampleSizeComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of sample size.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisSampleSizeComponent.description");
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
         * @param value {@link #description} (Human-readable summary of sample size.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EffectEvidenceSynthesisSampleSizeComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of sample size.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of sample size.
         */
        public EffectEvidenceSynthesisSampleSizeComponent setDescription(String value) { 
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
         * @return {@link #numberOfStudies} (Number of studies included in this evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getNumberOfStudies" gives direct access to the value
         */
        public IntegerType getNumberOfStudiesElement() { 
          if (this.numberOfStudies == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisSampleSizeComponent.numberOfStudies");
            else if (Configuration.doAutoCreate())
              this.numberOfStudies = new IntegerType(); // bb
          return this.numberOfStudies;
        }

        public boolean hasNumberOfStudiesElement() { 
          return this.numberOfStudies != null && !this.numberOfStudies.isEmpty();
        }

        public boolean hasNumberOfStudies() { 
          return this.numberOfStudies != null && !this.numberOfStudies.isEmpty();
        }

        /**
         * @param value {@link #numberOfStudies} (Number of studies included in this evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getNumberOfStudies" gives direct access to the value
         */
        public EffectEvidenceSynthesisSampleSizeComponent setNumberOfStudiesElement(IntegerType value) { 
          this.numberOfStudies = value;
          return this;
        }

        /**
         * @return Number of studies included in this evidence synthesis.
         */
        public int getNumberOfStudies() { 
          return this.numberOfStudies == null || this.numberOfStudies.isEmpty() ? 0 : this.numberOfStudies.getValue();
        }

        /**
         * @param value Number of studies included in this evidence synthesis.
         */
        public EffectEvidenceSynthesisSampleSizeComponent setNumberOfStudies(int value) { 
            if (this.numberOfStudies == null)
              this.numberOfStudies = new IntegerType();
            this.numberOfStudies.setValue(value);
          return this;
        }

        /**
         * @return {@link #numberOfParticipants} (Number of participants included in this evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getNumberOfParticipants" gives direct access to the value
         */
        public IntegerType getNumberOfParticipantsElement() { 
          if (this.numberOfParticipants == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisSampleSizeComponent.numberOfParticipants");
            else if (Configuration.doAutoCreate())
              this.numberOfParticipants = new IntegerType(); // bb
          return this.numberOfParticipants;
        }

        public boolean hasNumberOfParticipantsElement() { 
          return this.numberOfParticipants != null && !this.numberOfParticipants.isEmpty();
        }

        public boolean hasNumberOfParticipants() { 
          return this.numberOfParticipants != null && !this.numberOfParticipants.isEmpty();
        }

        /**
         * @param value {@link #numberOfParticipants} (Number of participants included in this evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getNumberOfParticipants" gives direct access to the value
         */
        public EffectEvidenceSynthesisSampleSizeComponent setNumberOfParticipantsElement(IntegerType value) { 
          this.numberOfParticipants = value;
          return this;
        }

        /**
         * @return Number of participants included in this evidence synthesis.
         */
        public int getNumberOfParticipants() { 
          return this.numberOfParticipants == null || this.numberOfParticipants.isEmpty() ? 0 : this.numberOfParticipants.getValue();
        }

        /**
         * @param value Number of participants included in this evidence synthesis.
         */
        public EffectEvidenceSynthesisSampleSizeComponent setNumberOfParticipants(int value) { 
            if (this.numberOfParticipants == null)
              this.numberOfParticipants = new IntegerType();
            this.numberOfParticipants.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of sample size.", 0, 1, description));
          children.add(new Property("numberOfStudies", "integer", "Number of studies included in this evidence synthesis.", 0, 1, numberOfStudies));
          children.add(new Property("numberOfParticipants", "integer", "Number of participants included in this evidence synthesis.", 0, 1, numberOfParticipants));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of sample size.", 0, 1, description);
          case -177467129: /*numberOfStudies*/  return new Property("numberOfStudies", "integer", "Number of studies included in this evidence synthesis.", 0, 1, numberOfStudies);
          case 1799357120: /*numberOfParticipants*/  return new Property("numberOfParticipants", "integer", "Number of participants included in this evidence synthesis.", 0, 1, numberOfParticipants);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case -177467129: /*numberOfStudies*/ return this.numberOfStudies == null ? new Base[0] : new Base[] {this.numberOfStudies}; // IntegerType
        case 1799357120: /*numberOfParticipants*/ return this.numberOfParticipants == null ? new Base[0] : new Base[] {this.numberOfParticipants}; // IntegerType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case -177467129: // numberOfStudies
          this.numberOfStudies = castToInteger(value); // IntegerType
          return value;
        case 1799357120: // numberOfParticipants
          this.numberOfParticipants = castToInteger(value); // IntegerType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("numberOfStudies")) {
          this.numberOfStudies = castToInteger(value); // IntegerType
        } else if (name.equals("numberOfParticipants")) {
          this.numberOfParticipants = castToInteger(value); // IntegerType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case -177467129:  return getNumberOfStudiesElement();
        case 1799357120:  return getNumberOfParticipantsElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case -177467129: /*numberOfStudies*/ return new String[] {"integer"};
        case 1799357120: /*numberOfParticipants*/ return new String[] {"integer"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.description");
        }
        else if (name.equals("numberOfStudies")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.numberOfStudies");
        }
        else if (name.equals("numberOfParticipants")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.numberOfParticipants");
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisSampleSizeComponent copy() {
        EffectEvidenceSynthesisSampleSizeComponent dst = new EffectEvidenceSynthesisSampleSizeComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisSampleSizeComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.numberOfStudies = numberOfStudies == null ? null : numberOfStudies.copy();
        dst.numberOfParticipants = numberOfParticipants == null ? null : numberOfParticipants.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisSampleSizeComponent))
          return false;
        EffectEvidenceSynthesisSampleSizeComponent o = (EffectEvidenceSynthesisSampleSizeComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(numberOfStudies, o.numberOfStudies, true)
           && compareDeep(numberOfParticipants, o.numberOfParticipants, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisSampleSizeComponent))
          return false;
        EffectEvidenceSynthesisSampleSizeComponent o = (EffectEvidenceSynthesisSampleSizeComponent) other_;
        return compareValues(description, o.description, true) && compareValues(numberOfStudies, o.numberOfStudies, true)
           && compareValues(numberOfParticipants, o.numberOfParticipants, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, numberOfStudies
          , numberOfParticipants);
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.sampleSize";

  }

  }

    @Block()
    public static class EffectEvidenceSynthesisResultsByExposureComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of results by exposure state.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of results by exposure", formalDefinition="Human-readable summary of results by exposure state." )
        protected StringType description;

        /**
         * Whether these results are for the exposure state or alternative exposure state.
         */
        @Child(name = "exposureState", type = {CodeType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="exposure | exposure-alternative", formalDefinition="Whether these results are for the exposure state or alternative exposure state." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/exposure-state")
        protected Enumeration<ExposureState> exposureState;

        /**
         * Used to define variant exposure states such as low-risk state.
         */
        @Child(name = "variantState", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Variant exposure states", formalDefinition="Used to define variant exposure states such as low-risk state." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/evidence-variant-state")
        protected CodeableConcept variantState;

        /**
         * Reference to a RiskEvidenceSynthesis resource.
         */
        @Child(name = "riskEvidenceSynthesis", type = {RiskEvidenceSynthesis.class}, order=4, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Risk evidence synthesis", formalDefinition="Reference to a RiskEvidenceSynthesis resource." )
        protected Reference riskEvidenceSynthesis;

        /**
         * The actual object that is the target of the reference (Reference to a RiskEvidenceSynthesis resource.)
         */
        protected RiskEvidenceSynthesis riskEvidenceSynthesisTarget;

        private static final long serialVersionUID = 144886133L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisResultsByExposureComponent() {
        super();
      }

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisResultsByExposureComponent(Reference riskEvidenceSynthesis) {
        super();
        this.riskEvidenceSynthesis = riskEvidenceSynthesis;
      }

        /**
         * @return {@link #description} (Human-readable summary of results by exposure state.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisResultsByExposureComponent.description");
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
         * @param value {@link #description} (Human-readable summary of results by exposure state.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of results by exposure state.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of results by exposure state.
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setDescription(String value) { 
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
         * @return {@link #exposureState} (Whether these results are for the exposure state or alternative exposure state.). This is the underlying object with id, value and extensions. The accessor "getExposureState" gives direct access to the value
         */
        public Enumeration<ExposureState> getExposureStateElement() { 
          if (this.exposureState == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisResultsByExposureComponent.exposureState");
            else if (Configuration.doAutoCreate())
              this.exposureState = new Enumeration<ExposureState>(new ExposureStateEnumFactory()); // bb
          return this.exposureState;
        }

        public boolean hasExposureStateElement() { 
          return this.exposureState != null && !this.exposureState.isEmpty();
        }

        public boolean hasExposureState() { 
          return this.exposureState != null && !this.exposureState.isEmpty();
        }

        /**
         * @param value {@link #exposureState} (Whether these results are for the exposure state or alternative exposure state.). This is the underlying object with id, value and extensions. The accessor "getExposureState" gives direct access to the value
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setExposureStateElement(Enumeration<ExposureState> value) { 
          this.exposureState = value;
          return this;
        }

        /**
         * @return Whether these results are for the exposure state or alternative exposure state.
         */
        public ExposureState getExposureState() { 
          return this.exposureState == null ? null : this.exposureState.getValue();
        }

        /**
         * @param value Whether these results are for the exposure state or alternative exposure state.
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setExposureState(ExposureState value) { 
          if (value == null)
            this.exposureState = null;
          else {
            if (this.exposureState == null)
              this.exposureState = new Enumeration<ExposureState>(new ExposureStateEnumFactory());
            this.exposureState.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #variantState} (Used to define variant exposure states such as low-risk state.)
         */
        public CodeableConcept getVariantState() { 
          if (this.variantState == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisResultsByExposureComponent.variantState");
            else if (Configuration.doAutoCreate())
              this.variantState = new CodeableConcept(); // cc
          return this.variantState;
        }

        public boolean hasVariantState() { 
          return this.variantState != null && !this.variantState.isEmpty();
        }

        /**
         * @param value {@link #variantState} (Used to define variant exposure states such as low-risk state.)
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setVariantState(CodeableConcept value) { 
          this.variantState = value;
          return this;
        }

        /**
         * @return {@link #riskEvidenceSynthesis} (Reference to a RiskEvidenceSynthesis resource.)
         */
        public Reference getRiskEvidenceSynthesis() { 
          if (this.riskEvidenceSynthesis == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisResultsByExposureComponent.riskEvidenceSynthesis");
            else if (Configuration.doAutoCreate())
              this.riskEvidenceSynthesis = new Reference(); // cc
          return this.riskEvidenceSynthesis;
        }

        public boolean hasRiskEvidenceSynthesis() { 
          return this.riskEvidenceSynthesis != null && !this.riskEvidenceSynthesis.isEmpty();
        }

        /**
         * @param value {@link #riskEvidenceSynthesis} (Reference to a RiskEvidenceSynthesis resource.)
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setRiskEvidenceSynthesis(Reference value) { 
          this.riskEvidenceSynthesis = value;
          return this;
        }

        /**
         * @return {@link #riskEvidenceSynthesis} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Reference to a RiskEvidenceSynthesis resource.)
         */
        public RiskEvidenceSynthesis getRiskEvidenceSynthesisTarget() { 
          if (this.riskEvidenceSynthesisTarget == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisResultsByExposureComponent.riskEvidenceSynthesis");
            else if (Configuration.doAutoCreate())
              this.riskEvidenceSynthesisTarget = new RiskEvidenceSynthesis(); // aa
          return this.riskEvidenceSynthesisTarget;
        }

        /**
         * @param value {@link #riskEvidenceSynthesis} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Reference to a RiskEvidenceSynthesis resource.)
         */
        public EffectEvidenceSynthesisResultsByExposureComponent setRiskEvidenceSynthesisTarget(RiskEvidenceSynthesis value) { 
          this.riskEvidenceSynthesisTarget = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of results by exposure state.", 0, 1, description));
          children.add(new Property("exposureState", "code", "Whether these results are for the exposure state or alternative exposure state.", 0, 1, exposureState));
          children.add(new Property("variantState", "CodeableConcept", "Used to define variant exposure states such as low-risk state.", 0, 1, variantState));
          children.add(new Property("riskEvidenceSynthesis", "Reference(RiskEvidenceSynthesis)", "Reference to a RiskEvidenceSynthesis resource.", 0, 1, riskEvidenceSynthesis));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of results by exposure state.", 0, 1, description);
          case 422339530: /*exposureState*/  return new Property("exposureState", "code", "Whether these results are for the exposure state or alternative exposure state.", 0, 1, exposureState);
          case 1900629772: /*variantState*/  return new Property("variantState", "CodeableConcept", "Used to define variant exposure states such as low-risk state.", 0, 1, variantState);
          case 109085678: /*riskEvidenceSynthesis*/  return new Property("riskEvidenceSynthesis", "Reference(RiskEvidenceSynthesis)", "Reference to a RiskEvidenceSynthesis resource.", 0, 1, riskEvidenceSynthesis);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 422339530: /*exposureState*/ return this.exposureState == null ? new Base[0] : new Base[] {this.exposureState}; // Enumeration<ExposureState>
        case 1900629772: /*variantState*/ return this.variantState == null ? new Base[0] : new Base[] {this.variantState}; // CodeableConcept
        case 109085678: /*riskEvidenceSynthesis*/ return this.riskEvidenceSynthesis == null ? new Base[0] : new Base[] {this.riskEvidenceSynthesis}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 422339530: // exposureState
          value = new ExposureStateEnumFactory().fromType(castToCode(value));
          this.exposureState = (Enumeration) value; // Enumeration<ExposureState>
          return value;
        case 1900629772: // variantState
          this.variantState = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 109085678: // riskEvidenceSynthesis
          this.riskEvidenceSynthesis = castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("exposureState")) {
          value = new ExposureStateEnumFactory().fromType(castToCode(value));
          this.exposureState = (Enumeration) value; // Enumeration<ExposureState>
        } else if (name.equals("variantState")) {
          this.variantState = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("riskEvidenceSynthesis")) {
          this.riskEvidenceSynthesis = castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 422339530:  return getExposureStateElement();
        case 1900629772:  return getVariantState(); 
        case 109085678:  return getRiskEvidenceSynthesis(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 422339530: /*exposureState*/ return new String[] {"code"};
        case 1900629772: /*variantState*/ return new String[] {"CodeableConcept"};
        case 109085678: /*riskEvidenceSynthesis*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.description");
        }
        else if (name.equals("exposureState")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.exposureState");
        }
        else if (name.equals("variantState")) {
          this.variantState = new CodeableConcept();
          return this.variantState;
        }
        else if (name.equals("riskEvidenceSynthesis")) {
          this.riskEvidenceSynthesis = new Reference();
          return this.riskEvidenceSynthesis;
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisResultsByExposureComponent copy() {
        EffectEvidenceSynthesisResultsByExposureComponent dst = new EffectEvidenceSynthesisResultsByExposureComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisResultsByExposureComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.exposureState = exposureState == null ? null : exposureState.copy();
        dst.variantState = variantState == null ? null : variantState.copy();
        dst.riskEvidenceSynthesis = riskEvidenceSynthesis == null ? null : riskEvidenceSynthesis.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisResultsByExposureComponent))
          return false;
        EffectEvidenceSynthesisResultsByExposureComponent o = (EffectEvidenceSynthesisResultsByExposureComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(exposureState, o.exposureState, true)
           && compareDeep(variantState, o.variantState, true) && compareDeep(riskEvidenceSynthesis, o.riskEvidenceSynthesis, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisResultsByExposureComponent))
          return false;
        EffectEvidenceSynthesisResultsByExposureComponent o = (EffectEvidenceSynthesisResultsByExposureComponent) other_;
        return compareValues(description, o.description, true) && compareValues(exposureState, o.exposureState, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, exposureState
          , variantState, riskEvidenceSynthesis);
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.resultsByExposure";

  }

  }

    @Block()
    public static class EffectEvidenceSynthesisEffectEstimateComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of effect estimate.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of effect estimate", formalDefinition="Human-readable summary of effect estimate." )
        protected StringType description;

        /**
         * Examples include relative risk and mean difference.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of efffect estimate", formalDefinition="Examples include relative risk and mean difference." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/effect-estimate-type")
        protected CodeableConcept type;

        /**
         * Used to define variant exposure states such as low-risk state.
         */
        @Child(name = "variantState", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Variant exposure states", formalDefinition="Used to define variant exposure states such as low-risk state." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/evidence-variant-state")
        protected CodeableConcept variantState;

        /**
         * The point estimate of the effect estimate.
         */
        @Child(name = "value", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Point estimate", formalDefinition="The point estimate of the effect estimate." )
        protected DecimalType value;

        /**
         * Specifies the UCUM unit for the outcome.
         */
        @Child(name = "unitOfMeasure", type = {CodeableConcept.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="What unit is the outcome described in?", formalDefinition="Specifies the UCUM unit for the outcome." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ucum-units")
        protected CodeableConcept unitOfMeasure;

        /**
         * A description of the precision of the estimate for the effect.
         */
        @Child(name = "precisionEstimate", type = {}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="How precise the estimate is", formalDefinition="A description of the precision of the estimate for the effect." )
        protected List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent> precisionEstimate;

        private static final long serialVersionUID = -1075065083L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisEffectEstimateComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of effect estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimateComponent.description");
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
         * @param value {@link #description} (Human-readable summary of effect estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of effect estimate.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of effect estimate.
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setDescription(String value) { 
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
         * @return {@link #type} (Examples include relative risk and mean difference.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimateComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Examples include relative risk and mean difference.)
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #variantState} (Used to define variant exposure states such as low-risk state.)
         */
        public CodeableConcept getVariantState() { 
          if (this.variantState == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimateComponent.variantState");
            else if (Configuration.doAutoCreate())
              this.variantState = new CodeableConcept(); // cc
          return this.variantState;
        }

        public boolean hasVariantState() { 
          return this.variantState != null && !this.variantState.isEmpty();
        }

        /**
         * @param value {@link #variantState} (Used to define variant exposure states such as low-risk state.)
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setVariantState(CodeableConcept value) { 
          this.variantState = value;
          return this;
        }

        /**
         * @return {@link #value} (The point estimate of the effect estimate.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public DecimalType getValueElement() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimateComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new DecimalType(); // bb
          return this.value;
        }

        public boolean hasValueElement() { 
          return this.value != null && !this.value.isEmpty();
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The point estimate of the effect estimate.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setValueElement(DecimalType value) { 
          this.value = value;
          return this;
        }

        /**
         * @return The point estimate of the effect estimate.
         */
        public BigDecimal getValue() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value The point estimate of the effect estimate.
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setValue(BigDecimal value) { 
          if (value == null)
            this.value = null;
          else {
            if (this.value == null)
              this.value = new DecimalType();
            this.value.setValue(value);
          }
          return this;
        }

        /**
         * @param value The point estimate of the effect estimate.
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setValue(long value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @param value The point estimate of the effect estimate.
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setValue(double value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @return {@link #unitOfMeasure} (Specifies the UCUM unit for the outcome.)
         */
        public CodeableConcept getUnitOfMeasure() { 
          if (this.unitOfMeasure == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimateComponent.unitOfMeasure");
            else if (Configuration.doAutoCreate())
              this.unitOfMeasure = new CodeableConcept(); // cc
          return this.unitOfMeasure;
        }

        public boolean hasUnitOfMeasure() { 
          return this.unitOfMeasure != null && !this.unitOfMeasure.isEmpty();
        }

        /**
         * @param value {@link #unitOfMeasure} (Specifies the UCUM unit for the outcome.)
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setUnitOfMeasure(CodeableConcept value) { 
          this.unitOfMeasure = value;
          return this;
        }

        /**
         * @return {@link #precisionEstimate} (A description of the precision of the estimate for the effect.)
         */
        public List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent> getPrecisionEstimate() { 
          if (this.precisionEstimate == null)
            this.precisionEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent>();
          return this.precisionEstimate;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisEffectEstimateComponent setPrecisionEstimate(List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent> thePrecisionEstimate) { 
          this.precisionEstimate = thePrecisionEstimate;
          return this;
        }

        public boolean hasPrecisionEstimate() { 
          if (this.precisionEstimate == null)
            return false;
          for (EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent item : this.precisionEstimate)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent addPrecisionEstimate() { //3
          EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent t = new EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent();
          if (this.precisionEstimate == null)
            this.precisionEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent>();
          this.precisionEstimate.add(t);
          return t;
        }

        public EffectEvidenceSynthesisEffectEstimateComponent addPrecisionEstimate(EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent t) { //3
          if (t == null)
            return this;
          if (this.precisionEstimate == null)
            this.precisionEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent>();
          this.precisionEstimate.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #precisionEstimate}, creating it if it does not already exist
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent getPrecisionEstimateFirstRep() { 
          if (getPrecisionEstimate().isEmpty()) {
            addPrecisionEstimate();
          }
          return getPrecisionEstimate().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of effect estimate.", 0, 1, description));
          children.add(new Property("type", "CodeableConcept", "Examples include relative risk and mean difference.", 0, 1, type));
          children.add(new Property("variantState", "CodeableConcept", "Used to define variant exposure states such as low-risk state.", 0, 1, variantState));
          children.add(new Property("value", "decimal", "The point estimate of the effect estimate.", 0, 1, value));
          children.add(new Property("unitOfMeasure", "CodeableConcept", "Specifies the UCUM unit for the outcome.", 0, 1, unitOfMeasure));
          children.add(new Property("precisionEstimate", "", "A description of the precision of the estimate for the effect.", 0, java.lang.Integer.MAX_VALUE, precisionEstimate));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of effect estimate.", 0, 1, description);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Examples include relative risk and mean difference.", 0, 1, type);
          case 1900629772: /*variantState*/  return new Property("variantState", "CodeableConcept", "Used to define variant exposure states such as low-risk state.", 0, 1, variantState);
          case 111972721: /*value*/  return new Property("value", "decimal", "The point estimate of the effect estimate.", 0, 1, value);
          case -750257565: /*unitOfMeasure*/  return new Property("unitOfMeasure", "CodeableConcept", "Specifies the UCUM unit for the outcome.", 0, 1, unitOfMeasure);
          case 339632070: /*precisionEstimate*/  return new Property("precisionEstimate", "", "A description of the precision of the estimate for the effect.", 0, java.lang.Integer.MAX_VALUE, precisionEstimate);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 1900629772: /*variantState*/ return this.variantState == null ? new Base[0] : new Base[] {this.variantState}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DecimalType
        case -750257565: /*unitOfMeasure*/ return this.unitOfMeasure == null ? new Base[0] : new Base[] {this.unitOfMeasure}; // CodeableConcept
        case 339632070: /*precisionEstimate*/ return this.precisionEstimate == null ? new Base[0] : this.precisionEstimate.toArray(new Base[this.precisionEstimate.size()]); // EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1900629772: // variantState
          this.variantState = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = castToDecimal(value); // DecimalType
          return value;
        case -750257565: // unitOfMeasure
          this.unitOfMeasure = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 339632070: // precisionEstimate
          this.getPrecisionEstimate().add((EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent) value); // EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("variantState")) {
          this.variantState = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value")) {
          this.value = castToDecimal(value); // DecimalType
        } else if (name.equals("unitOfMeasure")) {
          this.unitOfMeasure = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("precisionEstimate")) {
          this.getPrecisionEstimate().add((EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3575610:  return getType(); 
        case 1900629772:  return getVariantState(); 
        case 111972721:  return getValueElement();
        case -750257565:  return getUnitOfMeasure(); 
        case 339632070:  return addPrecisionEstimate(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 1900629772: /*variantState*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"decimal"};
        case -750257565: /*unitOfMeasure*/ return new String[] {"CodeableConcept"};
        case 339632070: /*precisionEstimate*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.description");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("variantState")) {
          this.variantState = new CodeableConcept();
          return this.variantState;
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.value");
        }
        else if (name.equals("unitOfMeasure")) {
          this.unitOfMeasure = new CodeableConcept();
          return this.unitOfMeasure;
        }
        else if (name.equals("precisionEstimate")) {
          return addPrecisionEstimate();
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisEffectEstimateComponent copy() {
        EffectEvidenceSynthesisEffectEstimateComponent dst = new EffectEvidenceSynthesisEffectEstimateComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisEffectEstimateComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.type = type == null ? null : type.copy();
        dst.variantState = variantState == null ? null : variantState.copy();
        dst.value = value == null ? null : value.copy();
        dst.unitOfMeasure = unitOfMeasure == null ? null : unitOfMeasure.copy();
        if (precisionEstimate != null) {
          dst.precisionEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent>();
          for (EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent i : precisionEstimate)
            dst.precisionEstimate.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisEffectEstimateComponent))
          return false;
        EffectEvidenceSynthesisEffectEstimateComponent o = (EffectEvidenceSynthesisEffectEstimateComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(type, o.type, true) && compareDeep(variantState, o.variantState, true)
           && compareDeep(value, o.value, true) && compareDeep(unitOfMeasure, o.unitOfMeasure, true) && compareDeep(precisionEstimate, o.precisionEstimate, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisEffectEstimateComponent))
          return false;
        EffectEvidenceSynthesisEffectEstimateComponent o = (EffectEvidenceSynthesisEffectEstimateComponent) other_;
        return compareValues(description, o.description, true) && compareValues(value, o.value, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, type, variantState
          , value, unitOfMeasure, precisionEstimate);
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.effectEstimate";

  }

  }

    @Block()
    public static class EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Examples include confidence interval and interquartile range.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of precision estimate", formalDefinition="Examples include confidence interval and interquartile range." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/precision-estimate-type")
        protected CodeableConcept type;

        /**
         * Use 95 for a 95% confidence interval.
         */
        @Child(name = "level", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Level of confidence interval", formalDefinition="Use 95 for a 95% confidence interval." )
        protected DecimalType level;

        /**
         * Lower bound of confidence interval.
         */
        @Child(name = "from", type = {DecimalType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Lower bound", formalDefinition="Lower bound of confidence interval." )
        protected DecimalType from;

        /**
         * Upper bound of confidence interval.
         */
        @Child(name = "to", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Upper bound", formalDefinition="Upper bound of confidence interval." )
        protected DecimalType to;

        private static final long serialVersionUID = -110178057L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent() {
        super();
      }

        /**
         * @return {@link #type} (Examples include confidence interval and interquartile range.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Examples include confidence interval and interquartile range.)
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #level} (Use 95 for a 95% confidence interval.). This is the underlying object with id, value and extensions. The accessor "getLevel" gives direct access to the value
         */
        public DecimalType getLevelElement() { 
          if (this.level == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent.level");
            else if (Configuration.doAutoCreate())
              this.level = new DecimalType(); // bb
          return this.level;
        }

        public boolean hasLevelElement() { 
          return this.level != null && !this.level.isEmpty();
        }

        public boolean hasLevel() { 
          return this.level != null && !this.level.isEmpty();
        }

        /**
         * @param value {@link #level} (Use 95 for a 95% confidence interval.). This is the underlying object with id, value and extensions. The accessor "getLevel" gives direct access to the value
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setLevelElement(DecimalType value) { 
          this.level = value;
          return this;
        }

        /**
         * @return Use 95 for a 95% confidence interval.
         */
        public BigDecimal getLevel() { 
          return this.level == null ? null : this.level.getValue();
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setLevel(BigDecimal value) { 
          if (value == null)
            this.level = null;
          else {
            if (this.level == null)
              this.level = new DecimalType();
            this.level.setValue(value);
          }
          return this;
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setLevel(long value) { 
              this.level = new DecimalType();
            this.level.setValue(value);
          return this;
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setLevel(double value) { 
              this.level = new DecimalType();
            this.level.setValue(value);
          return this;
        }

        /**
         * @return {@link #from} (Lower bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getFrom" gives direct access to the value
         */
        public DecimalType getFromElement() { 
          if (this.from == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent.from");
            else if (Configuration.doAutoCreate())
              this.from = new DecimalType(); // bb
          return this.from;
        }

        public boolean hasFromElement() { 
          return this.from != null && !this.from.isEmpty();
        }

        public boolean hasFrom() { 
          return this.from != null && !this.from.isEmpty();
        }

        /**
         * @param value {@link #from} (Lower bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getFrom" gives direct access to the value
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setFromElement(DecimalType value) { 
          this.from = value;
          return this;
        }

        /**
         * @return Lower bound of confidence interval.
         */
        public BigDecimal getFrom() { 
          return this.from == null ? null : this.from.getValue();
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setFrom(BigDecimal value) { 
          if (value == null)
            this.from = null;
          else {
            if (this.from == null)
              this.from = new DecimalType();
            this.from.setValue(value);
          }
          return this;
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setFrom(long value) { 
              this.from = new DecimalType();
            this.from.setValue(value);
          return this;
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setFrom(double value) { 
              this.from = new DecimalType();
            this.from.setValue(value);
          return this;
        }

        /**
         * @return {@link #to} (Upper bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getTo" gives direct access to the value
         */
        public DecimalType getToElement() { 
          if (this.to == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent.to");
            else if (Configuration.doAutoCreate())
              this.to = new DecimalType(); // bb
          return this.to;
        }

        public boolean hasToElement() { 
          return this.to != null && !this.to.isEmpty();
        }

        public boolean hasTo() { 
          return this.to != null && !this.to.isEmpty();
        }

        /**
         * @param value {@link #to} (Upper bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getTo" gives direct access to the value
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setToElement(DecimalType value) { 
          this.to = value;
          return this;
        }

        /**
         * @return Upper bound of confidence interval.
         */
        public BigDecimal getTo() { 
          return this.to == null ? null : this.to.getValue();
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setTo(BigDecimal value) { 
          if (value == null)
            this.to = null;
          else {
            if (this.to == null)
              this.to = new DecimalType();
            this.to.setValue(value);
          }
          return this;
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setTo(long value) { 
              this.to = new DecimalType();
            this.to.setValue(value);
          return this;
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent setTo(double value) { 
              this.to = new DecimalType();
            this.to.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Examples include confidence interval and interquartile range.", 0, 1, type));
          children.add(new Property("level", "decimal", "Use 95 for a 95% confidence interval.", 0, 1, level));
          children.add(new Property("from", "decimal", "Lower bound of confidence interval.", 0, 1, from));
          children.add(new Property("to", "decimal", "Upper bound of confidence interval.", 0, 1, to));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Examples include confidence interval and interquartile range.", 0, 1, type);
          case 102865796: /*level*/  return new Property("level", "decimal", "Use 95 for a 95% confidence interval.", 0, 1, level);
          case 3151786: /*from*/  return new Property("from", "decimal", "Lower bound of confidence interval.", 0, 1, from);
          case 3707: /*to*/  return new Property("to", "decimal", "Upper bound of confidence interval.", 0, 1, to);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 102865796: /*level*/ return this.level == null ? new Base[0] : new Base[] {this.level}; // DecimalType
        case 3151786: /*from*/ return this.from == null ? new Base[0] : new Base[] {this.from}; // DecimalType
        case 3707: /*to*/ return this.to == null ? new Base[0] : new Base[] {this.to}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 102865796: // level
          this.level = castToDecimal(value); // DecimalType
          return value;
        case 3151786: // from
          this.from = castToDecimal(value); // DecimalType
          return value;
        case 3707: // to
          this.to = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("level")) {
          this.level = castToDecimal(value); // DecimalType
        } else if (name.equals("from")) {
          this.from = castToDecimal(value); // DecimalType
        } else if (name.equals("to")) {
          this.to = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType(); 
        case 102865796:  return getLevelElement();
        case 3151786:  return getFromElement();
        case 3707:  return getToElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 102865796: /*level*/ return new String[] {"decimal"};
        case 3151786: /*from*/ return new String[] {"decimal"};
        case 3707: /*to*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("level")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.level");
        }
        else if (name.equals("from")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.from");
        }
        else if (name.equals("to")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.to");
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent copy() {
        EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent dst = new EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.level = level == null ? null : level.copy();
        dst.from = from == null ? null : from.copy();
        dst.to = to == null ? null : to.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent))
          return false;
        EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent o = (EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(level, o.level, true) && compareDeep(from, o.from, true)
           && compareDeep(to, o.to, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent))
          return false;
        EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent o = (EffectEvidenceSynthesisEffectEstimatePrecisionEstimateComponent) other_;
        return compareValues(level, o.level, true) && compareValues(from, o.from, true) && compareValues(to, o.to, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, level, from, to
          );
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.effectEstimate.precisionEstimate";

  }

  }

    @Block()
    public static class EffectEvidenceSynthesisCertaintyComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A rating of the certainty of the effect estimate.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Certainty rating", formalDefinition="A rating of the certainty of the effect estimate." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/evidence-quality")
        protected List<CodeableConcept> rating;

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Used for footnotes or explanatory notes", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
        protected List<Annotation> note;

        /**
         * A description of a component of the overall certainty.
         */
        @Child(name = "certaintySubcomponent", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="A component that contributes to the overall certainty", formalDefinition="A description of a component of the overall certainty." )
        protected List<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent> certaintySubcomponent;

        private static final long serialVersionUID = 647101417L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisCertaintyComponent() {
        super();
      }

        /**
         * @return {@link #rating} (A rating of the certainty of the effect estimate.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisCertaintyComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public EffectEvidenceSynthesisCertaintyComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        /**
         * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisCertaintyComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public EffectEvidenceSynthesisCertaintyComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #certaintySubcomponent} (A description of a component of the overall certainty.)
         */
        public List<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent> getCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent>();
          return this.certaintySubcomponent;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisCertaintyComponent setCertaintySubcomponent(List<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent> theCertaintySubcomponent) { 
          this.certaintySubcomponent = theCertaintySubcomponent;
          return this;
        }

        public boolean hasCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            return false;
          for (EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent item : this.certaintySubcomponent)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent addCertaintySubcomponent() { //3
          EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent t = new EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent();
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return t;
        }

        public EffectEvidenceSynthesisCertaintyComponent addCertaintySubcomponent(EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent t) { //3
          if (t == null)
            return this;
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #certaintySubcomponent}, creating it if it does not already exist
         */
        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent getCertaintySubcomponentFirstRep() { 
          if (getCertaintySubcomponent().isEmpty()) {
            addCertaintySubcomponent();
          }
          return getCertaintySubcomponent().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("rating", "CodeableConcept", "A rating of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, rating));
          children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("certaintySubcomponent", "", "A description of a component of the overall certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "A rating of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, rating);
          case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
          case 1806398212: /*certaintySubcomponent*/  return new Property("certaintySubcomponent", "", "A description of a component of the overall certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 1806398212: /*certaintySubcomponent*/ return this.certaintySubcomponent == null ? new Base[0] : this.certaintySubcomponent.toArray(new Base[this.certaintySubcomponent.size()]); // EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 1806398212: // certaintySubcomponent
          this.getCertaintySubcomponent().add((EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent) value); // EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("certaintySubcomponent")) {
          this.getCertaintySubcomponent().add((EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -938102371:  return addRating(); 
        case 3387378:  return addNote(); 
        case 1806398212:  return addCertaintySubcomponent(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 1806398212: /*certaintySubcomponent*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("rating")) {
          return addRating();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("certaintySubcomponent")) {
          return addCertaintySubcomponent();
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisCertaintyComponent copy() {
        EffectEvidenceSynthesisCertaintyComponent dst = new EffectEvidenceSynthesisCertaintyComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisCertaintyComponent dst) {
        super.copyValues(dst);
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (certaintySubcomponent != null) {
          dst.certaintySubcomponent = new ArrayList<EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent>();
          for (EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent i : certaintySubcomponent)
            dst.certaintySubcomponent.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisCertaintyComponent))
          return false;
        EffectEvidenceSynthesisCertaintyComponent o = (EffectEvidenceSynthesisCertaintyComponent) other_;
        return compareDeep(rating, o.rating, true) && compareDeep(note, o.note, true) && compareDeep(certaintySubcomponent, o.certaintySubcomponent, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisCertaintyComponent))
          return false;
        EffectEvidenceSynthesisCertaintyComponent o = (EffectEvidenceSynthesisCertaintyComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(rating, note, certaintySubcomponent
          );
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.certainty";

  }

  }

    @Block()
    public static class EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of subcomponent of certainty rating.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Type of subcomponent of certainty rating", formalDefinition="Type of subcomponent of certainty rating." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-type")
        protected CodeableConcept type;

        /**
         * A rating of a subcomponent of rating certainty.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Subcomponent certainty rating", formalDefinition="A rating of a subcomponent of rating certainty." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-rating")
        protected List<CodeableConcept> rating;

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         */
        @Child(name = "note", type = {Annotation.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Used for footnotes or explanatory notes", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
        protected List<Annotation> note;

        private static final long serialVersionUID = -411994816L;

    /**
     * Constructor
     */
      public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent() {
        super();
      }

        /**
         * @return {@link #type} (Type of subcomponent of certainty rating.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of subcomponent of certainty rating.)
         */
        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #rating} (A rating of a subcomponent of rating certainty.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        /**
         * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of subcomponent of certainty rating.", 0, 1, type));
          children.add(new Property("rating", "CodeableConcept", "A rating of a subcomponent of rating certainty.", 0, java.lang.Integer.MAX_VALUE, rating));
          children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of subcomponent of certainty rating.", 0, 1, type);
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "A rating of a subcomponent of rating certainty.", 0, java.lang.Integer.MAX_VALUE, rating);
          case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType(); 
        case -938102371:  return addRating(); 
        case 3387378:  return addNote(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("rating")) {
          return addRating();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else
          return super.addChild(name);
      }

      public EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent copy() {
        EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent dst = new EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent))
          return false;
        EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent o = (EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(rating, o.rating, true) && compareDeep(note, o.note, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent))
          return false;
        EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent o = (EffectEvidenceSynthesisCertaintyCertaintySubcomponentComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, rating, note);
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis.certainty.certaintySubcomponent";

  }

  }

    /**
     * A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the effect evidence synthesis", formalDefinition="A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * A human-readable string to clarify or explain concepts about the resource.
     */
    @Child(name = "note", type = {Annotation.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Used for footnotes or explanatory notes", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
    protected List<Annotation> note;

    /**
     * A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.
     */
    @Child(name = "copyright", type = {MarkdownType.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Use and/or publishing restrictions", formalDefinition="A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis." )
    protected MarkdownType copyright;

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    @Child(name = "approvalDate", type = {DateType.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the effect evidence synthesis was approved by publisher", formalDefinition="The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage." )
    protected DateType approvalDate;

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    @Child(name = "lastReviewDate", type = {DateType.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the effect evidence synthesis was last reviewed", formalDefinition="The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date." )
    protected DateType lastReviewDate;

    /**
     * The period during which the effect evidence synthesis content was or is planned to be in active use.
     */
    @Child(name = "effectivePeriod", type = {Period.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the effect evidence synthesis is expected to be used", formalDefinition="The period during which the effect evidence synthesis content was or is planned to be in active use." )
    protected Period effectivePeriod;

    /**
     * Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.
     */
    @Child(name = "topic", type = {CodeableConcept.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="The category of the EffectEvidenceSynthesis, such as Education, Treatment, Assessment, etc.", formalDefinition="Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/definition-topic")
    protected List<CodeableConcept> topic;

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     */
    @Child(name = "author", type = {ContactDetail.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who authored the content", formalDefinition="An individiual or organization primarily involved in the creation and maintenance of the content." )
    protected List<ContactDetail> author;

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     */
    @Child(name = "editor", type = {ContactDetail.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who edited the content", formalDefinition="An individual or organization primarily responsible for internal coherence of the content." )
    protected List<ContactDetail> editor;

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     */
    @Child(name = "reviewer", type = {ContactDetail.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who reviewed the content", formalDefinition="An individual or organization primarily responsible for review of some aspect of the content." )
    protected List<ContactDetail> reviewer;

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     */
    @Child(name = "endorser", type = {ContactDetail.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Who endorsed the content", formalDefinition="An individual or organization responsible for officially endorsing the content for use in some setting." )
    protected List<ContactDetail> endorser;

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     */
    @Child(name = "relatedArtifact", type = {RelatedArtifact.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Additional documentation, citations, etc.", formalDefinition="Related artifacts such as additional documentation, justification, or bibliographic references." )
    protected List<RelatedArtifact> relatedArtifact;

    /**
     * Type of synthesis eg meta-analysis.
     */
    @Child(name = "synthesisType", type = {CodeableConcept.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Type of synthesis", formalDefinition="Type of synthesis eg meta-analysis." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/synthesis-type")
    protected CodeableConcept synthesisType;

    /**
     * Type of study eg randomized trial.
     */
    @Child(name = "studyType", type = {CodeableConcept.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Type of study", formalDefinition="Type of study eg randomized trial." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/study-type")
    protected CodeableConcept studyType;

    /**
     * A reference to a EvidenceVariable resource that defines the population for the research.
     */
    @Child(name = "population", type = {EvidenceVariable.class}, order=14, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="What population?", formalDefinition="A reference to a EvidenceVariable resource that defines the population for the research." )
    protected Reference population;

    /**
     * The actual object that is the target of the reference (A reference to a EvidenceVariable resource that defines the population for the research.)
     */
    protected EvidenceVariable populationTarget;

    /**
     * A reference to a EvidenceVariable resource that defines the exposure for the research.
     */
    @Child(name = "exposure", type = {EvidenceVariable.class}, order=15, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="What exposure?", formalDefinition="A reference to a EvidenceVariable resource that defines the exposure for the research." )
    protected Reference exposure;

    /**
     * The actual object that is the target of the reference (A reference to a EvidenceVariable resource that defines the exposure for the research.)
     */
    protected EvidenceVariable exposureTarget;

    /**
     * A reference to a EvidenceVariable resource that defines the comparison exposure for the research.
     */
    @Child(name = "exposureAlternative", type = {EvidenceVariable.class}, order=16, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="What comparison exposure?", formalDefinition="A reference to a EvidenceVariable resource that defines the comparison exposure for the research." )
    protected Reference exposureAlternative;

    /**
     * The actual object that is the target of the reference (A reference to a EvidenceVariable resource that defines the comparison exposure for the research.)
     */
    protected EvidenceVariable exposureAlternativeTarget;

    /**
     * A reference to a EvidenceVariable resomece that defines the outcome for the research.
     */
    @Child(name = "outcome", type = {EvidenceVariable.class}, order=17, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="What outcome?", formalDefinition="A reference to a EvidenceVariable resomece that defines the outcome for the research." )
    protected Reference outcome;

    /**
     * The actual object that is the target of the reference (A reference to a EvidenceVariable resomece that defines the outcome for the research.)
     */
    protected EvidenceVariable outcomeTarget;

    /**
     * A description of the size of the sample involved in the synthesis.
     */
    @Child(name = "sampleSize", type = {}, order=18, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="What sample size was involved?", formalDefinition="A description of the size of the sample involved in the synthesis." )
    protected EffectEvidenceSynthesisSampleSizeComponent sampleSize;

    /**
     * A description of the results for each exposure considered in the effect estimate.
     */
    @Child(name = "resultsByExposure", type = {}, order=19, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="What was the result per exposure?", formalDefinition="A description of the results for each exposure considered in the effect estimate." )
    protected List<EffectEvidenceSynthesisResultsByExposureComponent> resultsByExposure;

    /**
     * The estimated effect of the exposure variant.
     */
    @Child(name = "effectEstimate", type = {}, order=20, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="What was the estimated effect", formalDefinition="The estimated effect of the exposure variant." )
    protected List<EffectEvidenceSynthesisEffectEstimateComponent> effectEstimate;

    /**
     * A description of the certainty of the effect estimate.
     */
    @Child(name = "certainty", type = {}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="How certain is the effect", formalDefinition="A description of the certainty of the effect estimate." )
    protected List<EffectEvidenceSynthesisCertaintyComponent> certainty;

    private static final long serialVersionUID = 23150467L;

  /**
   * Constructor
   */
    public EffectEvidenceSynthesis() {
      super();
    }

  /**
   * Constructor
   */
    public EffectEvidenceSynthesis(Enumeration<PublicationStatus> status, Reference population, Reference exposure, Reference exposureAlternative, Reference outcome) {
      super();
      this.status = status;
      this.population = population;
      this.exposure = exposure;
      this.exposureAlternative = exposureAlternative;
      this.outcome = outcome;
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public EffectEvidenceSynthesis setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.
     */
    public EffectEvidenceSynthesis setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setIdentifier(List<Identifier> theIdentifier) { 
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

    public EffectEvidenceSynthesis addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public EffectEvidenceSynthesis setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public EffectEvidenceSynthesis setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #name} (A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public EffectEvidenceSynthesis setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public EffectEvidenceSynthesis setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public EffectEvidenceSynthesis setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the effect evidence synthesis.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the effect evidence synthesis.
     */
    public EffectEvidenceSynthesis setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public EffectEvidenceSynthesis setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.
     */
    public EffectEvidenceSynthesis setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.date");
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
     * @param value {@link #date} (The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public EffectEvidenceSynthesis setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.
     */
    public EffectEvidenceSynthesis setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #publisher} (The name of the organization or individual that published the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public StringType getPublisherElement() { 
      if (this.publisher == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.publisher");
        else if (Configuration.doAutoCreate())
          this.publisher = new StringType(); // bb
      return this.publisher;
    }

    public boolean hasPublisherElement() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    public boolean hasPublisher() { 
      return this.publisher != null && !this.publisher.isEmpty();
    }

    /**
     * @param value {@link #publisher} (The name of the organization or individual that published the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getPublisher" gives direct access to the value
     */
    public EffectEvidenceSynthesis setPublisherElement(StringType value) { 
      this.publisher = value;
      return this;
    }

    /**
     * @return The name of the organization or individual that published the effect evidence synthesis.
     */
    public String getPublisher() { 
      return this.publisher == null ? null : this.publisher.getValue();
    }

    /**
     * @param value The name of the organization or individual that published the effect evidence synthesis.
     */
    public EffectEvidenceSynthesis setPublisher(String value) { 
      if (Utilities.noString(value))
        this.publisher = null;
      else {
        if (this.publisher == null)
          this.publisher = new StringType();
        this.publisher.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contact} (Contact details to assist a user in finding and communicating with the publisher.)
     */
    public List<ContactDetail> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setContact(List<ContactDetail> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ContactDetail item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addContact() { //3
      ContactDetail t = new ContactDetail();
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addContact(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ContactDetail>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist
     */
    public ContactDetail getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #description} (A free text natural language description of the effect evidence synthesis from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the effect evidence synthesis from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public EffectEvidenceSynthesis setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the effect evidence synthesis from a consumer's perspective.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the effect evidence synthesis from a consumer's perspective.
     */
    public EffectEvidenceSynthesis setDescription(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate effect evidence synthesis instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #jurisdiction} (A legal or geographic region in which the effect evidence synthesis is intended to be used.)
     */
    public List<CodeableConcept> getJurisdiction() { 
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      return this.jurisdiction;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setJurisdiction(List<CodeableConcept> theJurisdiction) { 
      this.jurisdiction = theJurisdiction;
      return this;
    }

    public boolean hasJurisdiction() { 
      if (this.jurisdiction == null)
        return false;
      for (CodeableConcept item : this.jurisdiction)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addJurisdiction() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      this.jurisdiction.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addJurisdiction(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.jurisdiction == null)
        this.jurisdiction = new ArrayList<CodeableConcept>();
      this.jurisdiction.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #jurisdiction}, creating it if it does not already exist
     */
    public CodeableConcept getJurisdictionFirstRep() { 
      if (getJurisdiction().isEmpty()) {
        addJurisdiction();
      }
      return getJurisdiction().get(0);
    }

    /**
     * @return {@link #copyright} (A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public MarkdownType getCopyrightElement() { 
      if (this.copyright == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.copyright");
        else if (Configuration.doAutoCreate())
          this.copyright = new MarkdownType(); // bb
      return this.copyright;
    }

    public boolean hasCopyrightElement() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    public boolean hasCopyright() { 
      return this.copyright != null && !this.copyright.isEmpty();
    }

    /**
     * @param value {@link #copyright} (A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.). This is the underlying object with id, value and extensions. The accessor "getCopyright" gives direct access to the value
     */
    public EffectEvidenceSynthesis setCopyrightElement(MarkdownType value) { 
      this.copyright = value;
      return this;
    }

    /**
     * @return A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.
     */
    public String getCopyright() { 
      return this.copyright == null ? null : this.copyright.getValue();
    }

    /**
     * @param value A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.
     */
    public EffectEvidenceSynthesis setCopyright(String value) { 
      if (value == null)
        this.copyright = null;
      else {
        if (this.copyright == null)
          this.copyright = new MarkdownType();
        this.copyright.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public DateType getApprovalDateElement() { 
      if (this.approvalDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.approvalDate");
        else if (Configuration.doAutoCreate())
          this.approvalDate = new DateType(); // bb
      return this.approvalDate;
    }

    public boolean hasApprovalDateElement() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    public boolean hasApprovalDate() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    /**
     * @param value {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public EffectEvidenceSynthesis setApprovalDateElement(DateType value) { 
      this.approvalDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public Date getApprovalDate() { 
      return this.approvalDate == null ? null : this.approvalDate.getValue();
    }

    /**
     * @param value The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public EffectEvidenceSynthesis setApprovalDate(Date value) { 
      if (value == null)
        this.approvalDate = null;
      else {
        if (this.approvalDate == null)
          this.approvalDate = new DateType();
        this.approvalDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public DateType getLastReviewDateElement() { 
      if (this.lastReviewDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.lastReviewDate");
        else if (Configuration.doAutoCreate())
          this.lastReviewDate = new DateType(); // bb
      return this.lastReviewDate;
    }

    public boolean hasLastReviewDateElement() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    public boolean hasLastReviewDate() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    /**
     * @param value {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public EffectEvidenceSynthesis setLastReviewDateElement(DateType value) { 
      this.lastReviewDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public Date getLastReviewDate() { 
      return this.lastReviewDate == null ? null : this.lastReviewDate.getValue();
    }

    /**
     * @param value The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public EffectEvidenceSynthesis setLastReviewDate(Date value) { 
      if (value == null)
        this.lastReviewDate = null;
      else {
        if (this.lastReviewDate == null)
          this.lastReviewDate = new DateType();
        this.lastReviewDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #effectivePeriod} (The period during which the effect evidence synthesis content was or is planned to be in active use.)
     */
    public Period getEffectivePeriod() { 
      if (this.effectivePeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.effectivePeriod");
        else if (Configuration.doAutoCreate())
          this.effectivePeriod = new Period(); // cc
      return this.effectivePeriod;
    }

    public boolean hasEffectivePeriod() { 
      return this.effectivePeriod != null && !this.effectivePeriod.isEmpty();
    }

    /**
     * @param value {@link #effectivePeriod} (The period during which the effect evidence synthesis content was or is planned to be in active use.)
     */
    public EffectEvidenceSynthesis setEffectivePeriod(Period value) { 
      this.effectivePeriod = value;
      return this;
    }

    /**
     * @return {@link #topic} (Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.)
     */
    public List<CodeableConcept> getTopic() { 
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      return this.topic;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setTopic(List<CodeableConcept> theTopic) { 
      this.topic = theTopic;
      return this;
    }

    public boolean hasTopic() { 
      if (this.topic == null)
        return false;
      for (CodeableConcept item : this.topic)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addTopic() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      this.topic.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addTopic(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.topic == null)
        this.topic = new ArrayList<CodeableConcept>();
      this.topic.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #topic}, creating it if it does not already exist
     */
    public CodeableConcept getTopicFirstRep() { 
      if (getTopic().isEmpty()) {
        addTopic();
      }
      return getTopic().get(0);
    }

    /**
     * @return {@link #author} (An individiual or organization primarily involved in the creation and maintenance of the content.)
     */
    public List<ContactDetail> getAuthor() { 
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      return this.author;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setAuthor(List<ContactDetail> theAuthor) { 
      this.author = theAuthor;
      return this;
    }

    public boolean hasAuthor() { 
      if (this.author == null)
        return false;
      for (ContactDetail item : this.author)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addAuthor() { //3
      ContactDetail t = new ContactDetail();
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      this.author.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addAuthor(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.author == null)
        this.author = new ArrayList<ContactDetail>();
      this.author.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist
     */
    public ContactDetail getAuthorFirstRep() { 
      if (getAuthor().isEmpty()) {
        addAuthor();
      }
      return getAuthor().get(0);
    }

    /**
     * @return {@link #editor} (An individual or organization primarily responsible for internal coherence of the content.)
     */
    public List<ContactDetail> getEditor() { 
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      return this.editor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setEditor(List<ContactDetail> theEditor) { 
      this.editor = theEditor;
      return this;
    }

    public boolean hasEditor() { 
      if (this.editor == null)
        return false;
      for (ContactDetail item : this.editor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addEditor() { //3
      ContactDetail t = new ContactDetail();
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      this.editor.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addEditor(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.editor == null)
        this.editor = new ArrayList<ContactDetail>();
      this.editor.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #editor}, creating it if it does not already exist
     */
    public ContactDetail getEditorFirstRep() { 
      if (getEditor().isEmpty()) {
        addEditor();
      }
      return getEditor().get(0);
    }

    /**
     * @return {@link #reviewer} (An individual or organization primarily responsible for review of some aspect of the content.)
     */
    public List<ContactDetail> getReviewer() { 
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      return this.reviewer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setReviewer(List<ContactDetail> theReviewer) { 
      this.reviewer = theReviewer;
      return this;
    }

    public boolean hasReviewer() { 
      if (this.reviewer == null)
        return false;
      for (ContactDetail item : this.reviewer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addReviewer() { //3
      ContactDetail t = new ContactDetail();
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      this.reviewer.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addReviewer(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.reviewer == null)
        this.reviewer = new ArrayList<ContactDetail>();
      this.reviewer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #reviewer}, creating it if it does not already exist
     */
    public ContactDetail getReviewerFirstRep() { 
      if (getReviewer().isEmpty()) {
        addReviewer();
      }
      return getReviewer().get(0);
    }

    /**
     * @return {@link #endorser} (An individual or organization responsible for officially endorsing the content for use in some setting.)
     */
    public List<ContactDetail> getEndorser() { 
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      return this.endorser;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setEndorser(List<ContactDetail> theEndorser) { 
      this.endorser = theEndorser;
      return this;
    }

    public boolean hasEndorser() { 
      if (this.endorser == null)
        return false;
      for (ContactDetail item : this.endorser)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactDetail addEndorser() { //3
      ContactDetail t = new ContactDetail();
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      this.endorser.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addEndorser(ContactDetail t) { //3
      if (t == null)
        return this;
      if (this.endorser == null)
        this.endorser = new ArrayList<ContactDetail>();
      this.endorser.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #endorser}, creating it if it does not already exist
     */
    public ContactDetail getEndorserFirstRep() { 
      if (getEndorser().isEmpty()) {
        addEndorser();
      }
      return getEndorser().get(0);
    }

    /**
     * @return {@link #relatedArtifact} (Related artifacts such as additional documentation, justification, or bibliographic references.)
     */
    public List<RelatedArtifact> getRelatedArtifact() { 
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      return this.relatedArtifact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact) { 
      this.relatedArtifact = theRelatedArtifact;
      return this;
    }

    public boolean hasRelatedArtifact() { 
      if (this.relatedArtifact == null)
        return false;
      for (RelatedArtifact item : this.relatedArtifact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedArtifact addRelatedArtifact() { //3
      RelatedArtifact t = new RelatedArtifact();
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addRelatedArtifact(RelatedArtifact t) { //3
      if (t == null)
        return this;
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatedArtifact}, creating it if it does not already exist
     */
    public RelatedArtifact getRelatedArtifactFirstRep() { 
      if (getRelatedArtifact().isEmpty()) {
        addRelatedArtifact();
      }
      return getRelatedArtifact().get(0);
    }

    /**
     * @return {@link #synthesisType} (Type of synthesis eg meta-analysis.)
     */
    public CodeableConcept getSynthesisType() { 
      if (this.synthesisType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.synthesisType");
        else if (Configuration.doAutoCreate())
          this.synthesisType = new CodeableConcept(); // cc
      return this.synthesisType;
    }

    public boolean hasSynthesisType() { 
      return this.synthesisType != null && !this.synthesisType.isEmpty();
    }

    /**
     * @param value {@link #synthesisType} (Type of synthesis eg meta-analysis.)
     */
    public EffectEvidenceSynthesis setSynthesisType(CodeableConcept value) { 
      this.synthesisType = value;
      return this;
    }

    /**
     * @return {@link #studyType} (Type of study eg randomized trial.)
     */
    public CodeableConcept getStudyType() { 
      if (this.studyType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.studyType");
        else if (Configuration.doAutoCreate())
          this.studyType = new CodeableConcept(); // cc
      return this.studyType;
    }

    public boolean hasStudyType() { 
      return this.studyType != null && !this.studyType.isEmpty();
    }

    /**
     * @param value {@link #studyType} (Type of study eg randomized trial.)
     */
    public EffectEvidenceSynthesis setStudyType(CodeableConcept value) { 
      this.studyType = value;
      return this;
    }

    /**
     * @return {@link #population} (A reference to a EvidenceVariable resource that defines the population for the research.)
     */
    public Reference getPopulation() { 
      if (this.population == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.population");
        else if (Configuration.doAutoCreate())
          this.population = new Reference(); // cc
      return this.population;
    }

    public boolean hasPopulation() { 
      return this.population != null && !this.population.isEmpty();
    }

    /**
     * @param value {@link #population} (A reference to a EvidenceVariable resource that defines the population for the research.)
     */
    public EffectEvidenceSynthesis setPopulation(Reference value) { 
      this.population = value;
      return this;
    }

    /**
     * @return {@link #population} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the population for the research.)
     */
    public EvidenceVariable getPopulationTarget() { 
      if (this.populationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.population");
        else if (Configuration.doAutoCreate())
          this.populationTarget = new EvidenceVariable(); // aa
      return this.populationTarget;
    }

    /**
     * @param value {@link #population} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the population for the research.)
     */
    public EffectEvidenceSynthesis setPopulationTarget(EvidenceVariable value) { 
      this.populationTarget = value;
      return this;
    }

    /**
     * @return {@link #exposure} (A reference to a EvidenceVariable resource that defines the exposure for the research.)
     */
    public Reference getExposure() { 
      if (this.exposure == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.exposure");
        else if (Configuration.doAutoCreate())
          this.exposure = new Reference(); // cc
      return this.exposure;
    }

    public boolean hasExposure() { 
      return this.exposure != null && !this.exposure.isEmpty();
    }

    /**
     * @param value {@link #exposure} (A reference to a EvidenceVariable resource that defines the exposure for the research.)
     */
    public EffectEvidenceSynthesis setExposure(Reference value) { 
      this.exposure = value;
      return this;
    }

    /**
     * @return {@link #exposure} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the exposure for the research.)
     */
    public EvidenceVariable getExposureTarget() { 
      if (this.exposureTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.exposure");
        else if (Configuration.doAutoCreate())
          this.exposureTarget = new EvidenceVariable(); // aa
      return this.exposureTarget;
    }

    /**
     * @param value {@link #exposure} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the exposure for the research.)
     */
    public EffectEvidenceSynthesis setExposureTarget(EvidenceVariable value) { 
      this.exposureTarget = value;
      return this;
    }

    /**
     * @return {@link #exposureAlternative} (A reference to a EvidenceVariable resource that defines the comparison exposure for the research.)
     */
    public Reference getExposureAlternative() { 
      if (this.exposureAlternative == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.exposureAlternative");
        else if (Configuration.doAutoCreate())
          this.exposureAlternative = new Reference(); // cc
      return this.exposureAlternative;
    }

    public boolean hasExposureAlternative() { 
      return this.exposureAlternative != null && !this.exposureAlternative.isEmpty();
    }

    /**
     * @param value {@link #exposureAlternative} (A reference to a EvidenceVariable resource that defines the comparison exposure for the research.)
     */
    public EffectEvidenceSynthesis setExposureAlternative(Reference value) { 
      this.exposureAlternative = value;
      return this;
    }

    /**
     * @return {@link #exposureAlternative} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the comparison exposure for the research.)
     */
    public EvidenceVariable getExposureAlternativeTarget() { 
      if (this.exposureAlternativeTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.exposureAlternative");
        else if (Configuration.doAutoCreate())
          this.exposureAlternativeTarget = new EvidenceVariable(); // aa
      return this.exposureAlternativeTarget;
    }

    /**
     * @param value {@link #exposureAlternative} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resource that defines the comparison exposure for the research.)
     */
    public EffectEvidenceSynthesis setExposureAlternativeTarget(EvidenceVariable value) { 
      this.exposureAlternativeTarget = value;
      return this;
    }

    /**
     * @return {@link #outcome} (A reference to a EvidenceVariable resomece that defines the outcome for the research.)
     */
    public Reference getOutcome() { 
      if (this.outcome == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.outcome");
        else if (Configuration.doAutoCreate())
          this.outcome = new Reference(); // cc
      return this.outcome;
    }

    public boolean hasOutcome() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (A reference to a EvidenceVariable resomece that defines the outcome for the research.)
     */
    public EffectEvidenceSynthesis setOutcome(Reference value) { 
      this.outcome = value;
      return this;
    }

    /**
     * @return {@link #outcome} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resomece that defines the outcome for the research.)
     */
    public EvidenceVariable getOutcomeTarget() { 
      if (this.outcomeTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.outcome");
        else if (Configuration.doAutoCreate())
          this.outcomeTarget = new EvidenceVariable(); // aa
      return this.outcomeTarget;
    }

    /**
     * @param value {@link #outcome} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (A reference to a EvidenceVariable resomece that defines the outcome for the research.)
     */
    public EffectEvidenceSynthesis setOutcomeTarget(EvidenceVariable value) { 
      this.outcomeTarget = value;
      return this;
    }

    /**
     * @return {@link #sampleSize} (A description of the size of the sample involved in the synthesis.)
     */
    public EffectEvidenceSynthesisSampleSizeComponent getSampleSize() { 
      if (this.sampleSize == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EffectEvidenceSynthesis.sampleSize");
        else if (Configuration.doAutoCreate())
          this.sampleSize = new EffectEvidenceSynthesisSampleSizeComponent(); // cc
      return this.sampleSize;
    }

    public boolean hasSampleSize() { 
      return this.sampleSize != null && !this.sampleSize.isEmpty();
    }

    /**
     * @param value {@link #sampleSize} (A description of the size of the sample involved in the synthesis.)
     */
    public EffectEvidenceSynthesis setSampleSize(EffectEvidenceSynthesisSampleSizeComponent value) { 
      this.sampleSize = value;
      return this;
    }

    /**
     * @return {@link #resultsByExposure} (A description of the results for each exposure considered in the effect estimate.)
     */
    public List<EffectEvidenceSynthesisResultsByExposureComponent> getResultsByExposure() { 
      if (this.resultsByExposure == null)
        this.resultsByExposure = new ArrayList<EffectEvidenceSynthesisResultsByExposureComponent>();
      return this.resultsByExposure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setResultsByExposure(List<EffectEvidenceSynthesisResultsByExposureComponent> theResultsByExposure) { 
      this.resultsByExposure = theResultsByExposure;
      return this;
    }

    public boolean hasResultsByExposure() { 
      if (this.resultsByExposure == null)
        return false;
      for (EffectEvidenceSynthesisResultsByExposureComponent item : this.resultsByExposure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EffectEvidenceSynthesisResultsByExposureComponent addResultsByExposure() { //3
      EffectEvidenceSynthesisResultsByExposureComponent t = new EffectEvidenceSynthesisResultsByExposureComponent();
      if (this.resultsByExposure == null)
        this.resultsByExposure = new ArrayList<EffectEvidenceSynthesisResultsByExposureComponent>();
      this.resultsByExposure.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addResultsByExposure(EffectEvidenceSynthesisResultsByExposureComponent t) { //3
      if (t == null)
        return this;
      if (this.resultsByExposure == null)
        this.resultsByExposure = new ArrayList<EffectEvidenceSynthesisResultsByExposureComponent>();
      this.resultsByExposure.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #resultsByExposure}, creating it if it does not already exist
     */
    public EffectEvidenceSynthesisResultsByExposureComponent getResultsByExposureFirstRep() { 
      if (getResultsByExposure().isEmpty()) {
        addResultsByExposure();
      }
      return getResultsByExposure().get(0);
    }

    /**
     * @return {@link #effectEstimate} (The estimated effect of the exposure variant.)
     */
    public List<EffectEvidenceSynthesisEffectEstimateComponent> getEffectEstimate() { 
      if (this.effectEstimate == null)
        this.effectEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimateComponent>();
      return this.effectEstimate;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setEffectEstimate(List<EffectEvidenceSynthesisEffectEstimateComponent> theEffectEstimate) { 
      this.effectEstimate = theEffectEstimate;
      return this;
    }

    public boolean hasEffectEstimate() { 
      if (this.effectEstimate == null)
        return false;
      for (EffectEvidenceSynthesisEffectEstimateComponent item : this.effectEstimate)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EffectEvidenceSynthesisEffectEstimateComponent addEffectEstimate() { //3
      EffectEvidenceSynthesisEffectEstimateComponent t = new EffectEvidenceSynthesisEffectEstimateComponent();
      if (this.effectEstimate == null)
        this.effectEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimateComponent>();
      this.effectEstimate.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addEffectEstimate(EffectEvidenceSynthesisEffectEstimateComponent t) { //3
      if (t == null)
        return this;
      if (this.effectEstimate == null)
        this.effectEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimateComponent>();
      this.effectEstimate.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #effectEstimate}, creating it if it does not already exist
     */
    public EffectEvidenceSynthesisEffectEstimateComponent getEffectEstimateFirstRep() { 
      if (getEffectEstimate().isEmpty()) {
        addEffectEstimate();
      }
      return getEffectEstimate().get(0);
    }

    /**
     * @return {@link #certainty} (A description of the certainty of the effect estimate.)
     */
    public List<EffectEvidenceSynthesisCertaintyComponent> getCertainty() { 
      if (this.certainty == null)
        this.certainty = new ArrayList<EffectEvidenceSynthesisCertaintyComponent>();
      return this.certainty;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public EffectEvidenceSynthesis setCertainty(List<EffectEvidenceSynthesisCertaintyComponent> theCertainty) { 
      this.certainty = theCertainty;
      return this;
    }

    public boolean hasCertainty() { 
      if (this.certainty == null)
        return false;
      for (EffectEvidenceSynthesisCertaintyComponent item : this.certainty)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EffectEvidenceSynthesisCertaintyComponent addCertainty() { //3
      EffectEvidenceSynthesisCertaintyComponent t = new EffectEvidenceSynthesisCertaintyComponent();
      if (this.certainty == null)
        this.certainty = new ArrayList<EffectEvidenceSynthesisCertaintyComponent>();
      this.certainty.add(t);
      return t;
    }

    public EffectEvidenceSynthesis addCertainty(EffectEvidenceSynthesisCertaintyComponent t) { //3
      if (t == null)
        return this;
      if (this.certainty == null)
        this.certainty = new ArrayList<EffectEvidenceSynthesisCertaintyComponent>();
      this.certainty.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #certainty}, creating it if it does not already exist
     */
    public EffectEvidenceSynthesisCertaintyComponent getCertaintyFirstRep() { 
      if (getCertainty().isEmpty()) {
        addCertainty();
      }
      return getCertainty().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version));
        children.add(new Property("name", "string", "A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name));
        children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the effect evidence synthesis.", 0, 1, title));
        children.add(new Property("status", "code", "The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.", 0, 1, status));
        children.add(new Property("date", "dateTime", "The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.", 0, 1, date));
        children.add(new Property("publisher", "string", "The name of the organization or individual that published the effect evidence synthesis.", 0, 1, publisher));
        children.add(new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        children.add(new Property("description", "markdown", "A free text natural language description of the effect evidence synthesis from a consumer's perspective.", 0, 1, description));
        children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate effect evidence synthesis instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("jurisdiction", "CodeableConcept", "A legal or geographic region in which the effect evidence synthesis is intended to be used.", 0, java.lang.Integer.MAX_VALUE, jurisdiction));
        children.add(new Property("copyright", "markdown", "A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.", 0, 1, copyright));
        children.add(new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate));
        children.add(new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate));
        children.add(new Property("effectivePeriod", "Period", "The period during which the effect evidence synthesis content was or is planned to be in active use.", 0, 1, effectivePeriod));
        children.add(new Property("topic", "CodeableConcept", "Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.", 0, java.lang.Integer.MAX_VALUE, topic));
        children.add(new Property("author", "ContactDetail", "An individiual or organization primarily involved in the creation and maintenance of the content.", 0, java.lang.Integer.MAX_VALUE, author));
        children.add(new Property("editor", "ContactDetail", "An individual or organization primarily responsible for internal coherence of the content.", 0, java.lang.Integer.MAX_VALUE, editor));
        children.add(new Property("reviewer", "ContactDetail", "An individual or organization primarily responsible for review of some aspect of the content.", 0, java.lang.Integer.MAX_VALUE, reviewer));
        children.add(new Property("endorser", "ContactDetail", "An individual or organization responsible for officially endorsing the content for use in some setting.", 0, java.lang.Integer.MAX_VALUE, endorser));
        children.add(new Property("relatedArtifact", "RelatedArtifact", "Related artifacts such as additional documentation, justification, or bibliographic references.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact));
        children.add(new Property("synthesisType", "CodeableConcept", "Type of synthesis eg meta-analysis.", 0, 1, synthesisType));
        children.add(new Property("studyType", "CodeableConcept", "Type of study eg randomized trial.", 0, 1, studyType));
        children.add(new Property("population", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the population for the research.", 0, 1, population));
        children.add(new Property("exposure", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the exposure for the research.", 0, 1, exposure));
        children.add(new Property("exposureAlternative", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the comparison exposure for the research.", 0, 1, exposureAlternative));
        children.add(new Property("outcome", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resomece that defines the outcome for the research.", 0, 1, outcome));
        children.add(new Property("sampleSize", "", "A description of the size of the sample involved in the synthesis.", 0, 1, sampleSize));
        children.add(new Property("resultsByExposure", "", "A description of the results for each exposure considered in the effect estimate.", 0, java.lang.Integer.MAX_VALUE, resultsByExposure));
        children.add(new Property("effectEstimate", "", "The estimated effect of the exposure variant.", 0, java.lang.Integer.MAX_VALUE, effectEstimate));
        children.add(new Property("certainty", "", "A description of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, certainty));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this effect evidence synthesis when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this effect evidence synthesis is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the effect evidence synthesis is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The identifier that is used to identify this version of the effect evidence synthesis when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the effect evidence synthesis author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version);
        case 3373707: /*name*/  return new Property("name", "string", "A natural language name identifying the effect evidence synthesis. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name);
        case 110371416: /*title*/  return new Property("title", "string", "A short, descriptive, user-friendly title for the effect evidence synthesis.", 0, 1, title);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this effect evidence synthesis. Enables tracking the life-cycle of the content.", 0, 1, status);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date  (and optionally time) when the effect evidence synthesis was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the effect evidence synthesis changes.", 0, 1, date);
        case 1447404028: /*publisher*/  return new Property("publisher", "string", "The name of the organization or individual that published the effect evidence synthesis.", 0, 1, publisher);
        case 951526432: /*contact*/  return new Property("contact", "ContactDetail", "Contact details to assist a user in finding and communicating with the publisher.", 0, java.lang.Integer.MAX_VALUE, contact);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A free text natural language description of the effect evidence synthesis from a consumer's perspective.", 0, 1, description);
        case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate effect evidence synthesis instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case -507075711: /*jurisdiction*/  return new Property("jurisdiction", "CodeableConcept", "A legal or geographic region in which the effect evidence synthesis is intended to be used.", 0, java.lang.Integer.MAX_VALUE, jurisdiction);
        case 1522889671: /*copyright*/  return new Property("copyright", "markdown", "A copyright statement relating to the effect evidence synthesis and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the effect evidence synthesis.", 0, 1, copyright);
        case 223539345: /*approvalDate*/  return new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate);
        case -1687512484: /*lastReviewDate*/  return new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate);
        case -403934648: /*effectivePeriod*/  return new Property("effectivePeriod", "Period", "The period during which the effect evidence synthesis content was or is planned to be in active use.", 0, 1, effectivePeriod);
        case 110546223: /*topic*/  return new Property("topic", "CodeableConcept", "Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.", 0, java.lang.Integer.MAX_VALUE, topic);
        case -1406328437: /*author*/  return new Property("author", "ContactDetail", "An individiual or organization primarily involved in the creation and maintenance of the content.", 0, java.lang.Integer.MAX_VALUE, author);
        case -1307827859: /*editor*/  return new Property("editor", "ContactDetail", "An individual or organization primarily responsible for internal coherence of the content.", 0, java.lang.Integer.MAX_VALUE, editor);
        case -261190139: /*reviewer*/  return new Property("reviewer", "ContactDetail", "An individual or organization primarily responsible for review of some aspect of the content.", 0, java.lang.Integer.MAX_VALUE, reviewer);
        case 1740277666: /*endorser*/  return new Property("endorser", "ContactDetail", "An individual or organization responsible for officially endorsing the content for use in some setting.", 0, java.lang.Integer.MAX_VALUE, endorser);
        case 666807069: /*relatedArtifact*/  return new Property("relatedArtifact", "RelatedArtifact", "Related artifacts such as additional documentation, justification, or bibliographic references.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact);
        case 672726254: /*synthesisType*/  return new Property("synthesisType", "CodeableConcept", "Type of synthesis eg meta-analysis.", 0, 1, synthesisType);
        case -1955265373: /*studyType*/  return new Property("studyType", "CodeableConcept", "Type of study eg randomized trial.", 0, 1, studyType);
        case -2023558323: /*population*/  return new Property("population", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the population for the research.", 0, 1, population);
        case -1926005497: /*exposure*/  return new Property("exposure", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the exposure for the research.", 0, 1, exposure);
        case -1875462106: /*exposureAlternative*/  return new Property("exposureAlternative", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resource that defines the comparison exposure for the research.", 0, 1, exposureAlternative);
        case -1106507950: /*outcome*/  return new Property("outcome", "Reference(EvidenceVariable)", "A reference to a EvidenceVariable resomece that defines the outcome for the research.", 0, 1, outcome);
        case 143123659: /*sampleSize*/  return new Property("sampleSize", "", "A description of the size of the sample involved in the synthesis.", 0, 1, sampleSize);
        case 553042708: /*resultsByExposure*/  return new Property("resultsByExposure", "", "A description of the results for each exposure considered in the effect estimate.", 0, java.lang.Integer.MAX_VALUE, resultsByExposure);
        case 707469785: /*effectEstimate*/  return new Property("effectEstimate", "", "The estimated effect of the exposure variant.", 0, java.lang.Integer.MAX_VALUE, effectEstimate);
        case -1404142937: /*certainty*/  return new Property("certainty", "", "A description of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, certainty);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case 1447404028: /*publisher*/ return this.publisher == null ? new Base[0] : new Base[] {this.publisher}; // StringType
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case -507075711: /*jurisdiction*/ return this.jurisdiction == null ? new Base[0] : this.jurisdiction.toArray(new Base[this.jurisdiction.size()]); // CodeableConcept
        case 1522889671: /*copyright*/ return this.copyright == null ? new Base[0] : new Base[] {this.copyright}; // MarkdownType
        case 223539345: /*approvalDate*/ return this.approvalDate == null ? new Base[0] : new Base[] {this.approvalDate}; // DateType
        case -1687512484: /*lastReviewDate*/ return this.lastReviewDate == null ? new Base[0] : new Base[] {this.lastReviewDate}; // DateType
        case -403934648: /*effectivePeriod*/ return this.effectivePeriod == null ? new Base[0] : new Base[] {this.effectivePeriod}; // Period
        case 110546223: /*topic*/ return this.topic == null ? new Base[0] : this.topic.toArray(new Base[this.topic.size()]); // CodeableConcept
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // ContactDetail
        case -1307827859: /*editor*/ return this.editor == null ? new Base[0] : this.editor.toArray(new Base[this.editor.size()]); // ContactDetail
        case -261190139: /*reviewer*/ return this.reviewer == null ? new Base[0] : this.reviewer.toArray(new Base[this.reviewer.size()]); // ContactDetail
        case 1740277666: /*endorser*/ return this.endorser == null ? new Base[0] : this.endorser.toArray(new Base[this.endorser.size()]); // ContactDetail
        case 666807069: /*relatedArtifact*/ return this.relatedArtifact == null ? new Base[0] : this.relatedArtifact.toArray(new Base[this.relatedArtifact.size()]); // RelatedArtifact
        case 672726254: /*synthesisType*/ return this.synthesisType == null ? new Base[0] : new Base[] {this.synthesisType}; // CodeableConcept
        case -1955265373: /*studyType*/ return this.studyType == null ? new Base[0] : new Base[] {this.studyType}; // CodeableConcept
        case -2023558323: /*population*/ return this.population == null ? new Base[0] : new Base[] {this.population}; // Reference
        case -1926005497: /*exposure*/ return this.exposure == null ? new Base[0] : new Base[] {this.exposure}; // Reference
        case -1875462106: /*exposureAlternative*/ return this.exposureAlternative == null ? new Base[0] : new Base[] {this.exposureAlternative}; // Reference
        case -1106507950: /*outcome*/ return this.outcome == null ? new Base[0] : new Base[] {this.outcome}; // Reference
        case 143123659: /*sampleSize*/ return this.sampleSize == null ? new Base[0] : new Base[] {this.sampleSize}; // EffectEvidenceSynthesisSampleSizeComponent
        case 553042708: /*resultsByExposure*/ return this.resultsByExposure == null ? new Base[0] : this.resultsByExposure.toArray(new Base[this.resultsByExposure.size()]); // EffectEvidenceSynthesisResultsByExposureComponent
        case 707469785: /*effectEstimate*/ return this.effectEstimate == null ? new Base[0] : this.effectEstimate.toArray(new Base[this.effectEstimate.size()]); // EffectEvidenceSynthesisEffectEstimateComponent
        case -1404142937: /*certainty*/ return this.certainty == null ? new Base[0] : this.certainty.toArray(new Base[this.certainty.size()]); // EffectEvidenceSynthesisCertaintyComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = castToString(value); // StringType
          return value;
        case 3373707: // name
          this.name = castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = castToString(value); // StringType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case 1447404028: // publisher
          this.publisher = castToString(value); // StringType
          return value;
        case 951526432: // contact
          this.getContact().add(castToContactDetail(value)); // ContactDetail
          return value;
        case -1724546052: // description
          this.description = castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case -669707736: // useContext
          this.getUseContext().add(castToUsageContext(value)); // UsageContext
          return value;
        case -507075711: // jurisdiction
          this.getJurisdiction().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 1522889671: // copyright
          this.copyright = castToMarkdown(value); // MarkdownType
          return value;
        case 223539345: // approvalDate
          this.approvalDate = castToDate(value); // DateType
          return value;
        case -1687512484: // lastReviewDate
          this.lastReviewDate = castToDate(value); // DateType
          return value;
        case -403934648: // effectivePeriod
          this.effectivePeriod = castToPeriod(value); // Period
          return value;
        case 110546223: // topic
          this.getTopic().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1406328437: // author
          this.getAuthor().add(castToContactDetail(value)); // ContactDetail
          return value;
        case -1307827859: // editor
          this.getEditor().add(castToContactDetail(value)); // ContactDetail
          return value;
        case -261190139: // reviewer
          this.getReviewer().add(castToContactDetail(value)); // ContactDetail
          return value;
        case 1740277666: // endorser
          this.getEndorser().add(castToContactDetail(value)); // ContactDetail
          return value;
        case 666807069: // relatedArtifact
          this.getRelatedArtifact().add(castToRelatedArtifact(value)); // RelatedArtifact
          return value;
        case 672726254: // synthesisType
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1955265373: // studyType
          this.studyType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -2023558323: // population
          this.population = castToReference(value); // Reference
          return value;
        case -1926005497: // exposure
          this.exposure = castToReference(value); // Reference
          return value;
        case -1875462106: // exposureAlternative
          this.exposureAlternative = castToReference(value); // Reference
          return value;
        case -1106507950: // outcome
          this.outcome = castToReference(value); // Reference
          return value;
        case 143123659: // sampleSize
          this.sampleSize = (EffectEvidenceSynthesisSampleSizeComponent) value; // EffectEvidenceSynthesisSampleSizeComponent
          return value;
        case 553042708: // resultsByExposure
          this.getResultsByExposure().add((EffectEvidenceSynthesisResultsByExposureComponent) value); // EffectEvidenceSynthesisResultsByExposureComponent
          return value;
        case 707469785: // effectEstimate
          this.getEffectEstimate().add((EffectEvidenceSynthesisEffectEstimateComponent) value); // EffectEvidenceSynthesisEffectEstimateComponent
          return value;
        case -1404142937: // certainty
          this.getCertainty().add((EffectEvidenceSynthesisCertaintyComponent) value); // EffectEvidenceSynthesisCertaintyComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = castToString(value); // StringType
        } else if (name.equals("name")) {
          this.name = castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = castToString(value); // StringType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("publisher")) {
          this.publisher = castToString(value); // StringType
        } else if (name.equals("contact")) {
          this.getContact().add(castToContactDetail(value));
        } else if (name.equals("description")) {
          this.description = castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("useContext")) {
          this.getUseContext().add(castToUsageContext(value));
        } else if (name.equals("jurisdiction")) {
          this.getJurisdiction().add(castToCodeableConcept(value));
        } else if (name.equals("copyright")) {
          this.copyright = castToMarkdown(value); // MarkdownType
        } else if (name.equals("approvalDate")) {
          this.approvalDate = castToDate(value); // DateType
        } else if (name.equals("lastReviewDate")) {
          this.lastReviewDate = castToDate(value); // DateType
        } else if (name.equals("effectivePeriod")) {
          this.effectivePeriod = castToPeriod(value); // Period
        } else if (name.equals("topic")) {
          this.getTopic().add(castToCodeableConcept(value));
        } else if (name.equals("author")) {
          this.getAuthor().add(castToContactDetail(value));
        } else if (name.equals("editor")) {
          this.getEditor().add(castToContactDetail(value));
        } else if (name.equals("reviewer")) {
          this.getReviewer().add(castToContactDetail(value));
        } else if (name.equals("endorser")) {
          this.getEndorser().add(castToContactDetail(value));
        } else if (name.equals("relatedArtifact")) {
          this.getRelatedArtifact().add(castToRelatedArtifact(value));
        } else if (name.equals("synthesisType")) {
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("studyType")) {
          this.studyType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("population")) {
          this.population = castToReference(value); // Reference
        } else if (name.equals("exposure")) {
          this.exposure = castToReference(value); // Reference
        } else if (name.equals("exposureAlternative")) {
          this.exposureAlternative = castToReference(value); // Reference
        } else if (name.equals("outcome")) {
          this.outcome = castToReference(value); // Reference
        } else if (name.equals("sampleSize")) {
          this.sampleSize = (EffectEvidenceSynthesisSampleSizeComponent) value; // EffectEvidenceSynthesisSampleSizeComponent
        } else if (name.equals("resultsByExposure")) {
          this.getResultsByExposure().add((EffectEvidenceSynthesisResultsByExposureComponent) value);
        } else if (name.equals("effectEstimate")) {
          this.getEffectEstimate().add((EffectEvidenceSynthesisEffectEstimateComponent) value);
        } else if (name.equals("certainty")) {
          this.getCertainty().add((EffectEvidenceSynthesisCertaintyComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 3373707:  return getNameElement();
        case 110371416:  return getTitleElement();
        case -892481550:  return getStatusElement();
        case 3076014:  return getDateElement();
        case 1447404028:  return getPublisherElement();
        case 951526432:  return addContact(); 
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case -669707736:  return addUseContext(); 
        case -507075711:  return addJurisdiction(); 
        case 1522889671:  return getCopyrightElement();
        case 223539345:  return getApprovalDateElement();
        case -1687512484:  return getLastReviewDateElement();
        case -403934648:  return getEffectivePeriod(); 
        case 110546223:  return addTopic(); 
        case -1406328437:  return addAuthor(); 
        case -1307827859:  return addEditor(); 
        case -261190139:  return addReviewer(); 
        case 1740277666:  return addEndorser(); 
        case 666807069:  return addRelatedArtifact(); 
        case 672726254:  return getSynthesisType(); 
        case -1955265373:  return getStudyType(); 
        case -2023558323:  return getPopulation(); 
        case -1926005497:  return getExposure(); 
        case -1875462106:  return getExposureAlternative(); 
        case -1106507950:  return getOutcome(); 
        case 143123659:  return getSampleSize(); 
        case 553042708:  return addResultsByExposure(); 
        case 707469785:  return addEffectEstimate(); 
        case -1404142937:  return addCertainty(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case 1447404028: /*publisher*/ return new String[] {"string"};
        case 951526432: /*contact*/ return new String[] {"ContactDetail"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case -507075711: /*jurisdiction*/ return new String[] {"CodeableConcept"};
        case 1522889671: /*copyright*/ return new String[] {"markdown"};
        case 223539345: /*approvalDate*/ return new String[] {"date"};
        case -1687512484: /*lastReviewDate*/ return new String[] {"date"};
        case -403934648: /*effectivePeriod*/ return new String[] {"Period"};
        case 110546223: /*topic*/ return new String[] {"CodeableConcept"};
        case -1406328437: /*author*/ return new String[] {"ContactDetail"};
        case -1307827859: /*editor*/ return new String[] {"ContactDetail"};
        case -261190139: /*reviewer*/ return new String[] {"ContactDetail"};
        case 1740277666: /*endorser*/ return new String[] {"ContactDetail"};
        case 666807069: /*relatedArtifact*/ return new String[] {"RelatedArtifact"};
        case 672726254: /*synthesisType*/ return new String[] {"CodeableConcept"};
        case -1955265373: /*studyType*/ return new String[] {"CodeableConcept"};
        case -2023558323: /*population*/ return new String[] {"Reference"};
        case -1926005497: /*exposure*/ return new String[] {"Reference"};
        case -1875462106: /*exposureAlternative*/ return new String[] {"Reference"};
        case -1106507950: /*outcome*/ return new String[] {"Reference"};
        case 143123659: /*sampleSize*/ return new String[] {};
        case 553042708: /*resultsByExposure*/ return new String[] {};
        case 707469785: /*effectEstimate*/ return new String[] {};
        case -1404142937: /*certainty*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.version");
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.title");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.status");
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.date");
        }
        else if (name.equals("publisher")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.publisher");
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("jurisdiction")) {
          return addJurisdiction();
        }
        else if (name.equals("copyright")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.copyright");
        }
        else if (name.equals("approvalDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.approvalDate");
        }
        else if (name.equals("lastReviewDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type EffectEvidenceSynthesis.lastReviewDate");
        }
        else if (name.equals("effectivePeriod")) {
          this.effectivePeriod = new Period();
          return this.effectivePeriod;
        }
        else if (name.equals("topic")) {
          return addTopic();
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("editor")) {
          return addEditor();
        }
        else if (name.equals("reviewer")) {
          return addReviewer();
        }
        else if (name.equals("endorser")) {
          return addEndorser();
        }
        else if (name.equals("relatedArtifact")) {
          return addRelatedArtifact();
        }
        else if (name.equals("synthesisType")) {
          this.synthesisType = new CodeableConcept();
          return this.synthesisType;
        }
        else if (name.equals("studyType")) {
          this.studyType = new CodeableConcept();
          return this.studyType;
        }
        else if (name.equals("population")) {
          this.population = new Reference();
          return this.population;
        }
        else if (name.equals("exposure")) {
          this.exposure = new Reference();
          return this.exposure;
        }
        else if (name.equals("exposureAlternative")) {
          this.exposureAlternative = new Reference();
          return this.exposureAlternative;
        }
        else if (name.equals("outcome")) {
          this.outcome = new Reference();
          return this.outcome;
        }
        else if (name.equals("sampleSize")) {
          this.sampleSize = new EffectEvidenceSynthesisSampleSizeComponent();
          return this.sampleSize;
        }
        else if (name.equals("resultsByExposure")) {
          return addResultsByExposure();
        }
        else if (name.equals("effectEstimate")) {
          return addEffectEstimate();
        }
        else if (name.equals("certainty")) {
          return addCertainty();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "EffectEvidenceSynthesis";

  }

      public EffectEvidenceSynthesis copy() {
        EffectEvidenceSynthesis dst = new EffectEvidenceSynthesis();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EffectEvidenceSynthesis dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.publisher = publisher == null ? null : publisher.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactDetail>();
          for (ContactDetail i : contact)
            dst.contact.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        if (jurisdiction != null) {
          dst.jurisdiction = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : jurisdiction)
            dst.jurisdiction.add(i.copy());
        };
        dst.copyright = copyright == null ? null : copyright.copy();
        dst.approvalDate = approvalDate == null ? null : approvalDate.copy();
        dst.lastReviewDate = lastReviewDate == null ? null : lastReviewDate.copy();
        dst.effectivePeriod = effectivePeriod == null ? null : effectivePeriod.copy();
        if (topic != null) {
          dst.topic = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : topic)
            dst.topic.add(i.copy());
        };
        if (author != null) {
          dst.author = new ArrayList<ContactDetail>();
          for (ContactDetail i : author)
            dst.author.add(i.copy());
        };
        if (editor != null) {
          dst.editor = new ArrayList<ContactDetail>();
          for (ContactDetail i : editor)
            dst.editor.add(i.copy());
        };
        if (reviewer != null) {
          dst.reviewer = new ArrayList<ContactDetail>();
          for (ContactDetail i : reviewer)
            dst.reviewer.add(i.copy());
        };
        if (endorser != null) {
          dst.endorser = new ArrayList<ContactDetail>();
          for (ContactDetail i : endorser)
            dst.endorser.add(i.copy());
        };
        if (relatedArtifact != null) {
          dst.relatedArtifact = new ArrayList<RelatedArtifact>();
          for (RelatedArtifact i : relatedArtifact)
            dst.relatedArtifact.add(i.copy());
        };
        dst.synthesisType = synthesisType == null ? null : synthesisType.copy();
        dst.studyType = studyType == null ? null : studyType.copy();
        dst.population = population == null ? null : population.copy();
        dst.exposure = exposure == null ? null : exposure.copy();
        dst.exposureAlternative = exposureAlternative == null ? null : exposureAlternative.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.sampleSize = sampleSize == null ? null : sampleSize.copy();
        if (resultsByExposure != null) {
          dst.resultsByExposure = new ArrayList<EffectEvidenceSynthesisResultsByExposureComponent>();
          for (EffectEvidenceSynthesisResultsByExposureComponent i : resultsByExposure)
            dst.resultsByExposure.add(i.copy());
        };
        if (effectEstimate != null) {
          dst.effectEstimate = new ArrayList<EffectEvidenceSynthesisEffectEstimateComponent>();
          for (EffectEvidenceSynthesisEffectEstimateComponent i : effectEstimate)
            dst.effectEstimate.add(i.copy());
        };
        if (certainty != null) {
          dst.certainty = new ArrayList<EffectEvidenceSynthesisCertaintyComponent>();
          for (EffectEvidenceSynthesisCertaintyComponent i : certainty)
            dst.certainty.add(i.copy());
        };
      }

      protected EffectEvidenceSynthesis typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesis))
          return false;
        EffectEvidenceSynthesis o = (EffectEvidenceSynthesis) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(note, o.note, true) && compareDeep(copyright, o.copyright, true)
           && compareDeep(approvalDate, o.approvalDate, true) && compareDeep(lastReviewDate, o.lastReviewDate, true)
           && compareDeep(effectivePeriod, o.effectivePeriod, true) && compareDeep(topic, o.topic, true) && compareDeep(author, o.author, true)
           && compareDeep(editor, o.editor, true) && compareDeep(reviewer, o.reviewer, true) && compareDeep(endorser, o.endorser, true)
           && compareDeep(relatedArtifact, o.relatedArtifact, true) && compareDeep(synthesisType, o.synthesisType, true)
           && compareDeep(studyType, o.studyType, true) && compareDeep(population, o.population, true) && compareDeep(exposure, o.exposure, true)
           && compareDeep(exposureAlternative, o.exposureAlternative, true) && compareDeep(outcome, o.outcome, true)
           && compareDeep(sampleSize, o.sampleSize, true) && compareDeep(resultsByExposure, o.resultsByExposure, true)
           && compareDeep(effectEstimate, o.effectEstimate, true) && compareDeep(certainty, o.certainty, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EffectEvidenceSynthesis))
          return false;
        EffectEvidenceSynthesis o = (EffectEvidenceSynthesis) other_;
        return compareValues(copyright, o.copyright, true) && compareValues(approvalDate, o.approvalDate, true)
           && compareValues(lastReviewDate, o.lastReviewDate, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, note, copyright
          , approvalDate, lastReviewDate, effectivePeriod, topic, author, editor, reviewer
          , endorser, relatedArtifact, synthesisType, studyType, population, exposure, exposureAlternative
          , outcome, sampleSize, resultsByExposure, effectEstimate, certainty);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EffectEvidenceSynthesis;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The effect evidence synthesis publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EffectEvidenceSynthesis.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="EffectEvidenceSynthesis.date", description="The effect evidence synthesis publication date", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The effect evidence synthesis publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EffectEvidenceSynthesis.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="EffectEvidenceSynthesis.identifier", description="External identifier for the effect evidence synthesis", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the effect evidence synthesis</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-value", path="EffectEvidenceSynthesis.useContext", description="A use context type and value assigned to the effect evidence synthesis", type="composite", compositeOf={"context-type", "context"} )
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the effect evidence synthesis</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_CONTEXT_TYPE_VALUE);

 /**
   * Search parameter: <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.jurisdiction</b><br>
   * </p>
   */
  @SearchParamDefinition(name="jurisdiction", path="EffectEvidenceSynthesis.jurisdiction", description="Intended jurisdiction for the effect evidence synthesis", type="token" )
  public static final String SP_JURISDICTION = "jurisdiction";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>jurisdiction</b>
   * <p>
   * Description: <b>Intended jurisdiction for the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.jurisdiction</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam JURISDICTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_JURISDICTION);

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="EffectEvidenceSynthesis.description", description="The description of the effect evidence synthesis", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type", path="EffectEvidenceSynthesis.useContext.code", description="A type of use context assigned to the effect evidence synthesis", type="token" )
  public static final String SP_CONTEXT_TYPE = "context-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT_TYPE);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="EffectEvidenceSynthesis.title", description="The human-friendly name of the effect evidence synthesis", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="EffectEvidenceSynthesis.version", description="The business version of the effect evidence synthesis", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the effect evidence synthesis</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EffectEvidenceSynthesis.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="EffectEvidenceSynthesis.url", description="The uri that identifies the effect evidence synthesis", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the effect evidence synthesis</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>EffectEvidenceSynthesis.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.valueQuantity, EffectEvidenceSynthesis.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-quantity", path="(EffectEvidenceSynthesis.useContext.value as Quantity) | (EffectEvidenceSynthesis.useContext.value as Range)", description="A quantity- or range-valued use context assigned to the effect evidence synthesis", type="quantity" )
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.valueQuantity, EffectEvidenceSynthesis.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(SP_CONTEXT_QUANTITY);

 /**
   * Search parameter: <b>effective</b>
   * <p>
   * Description: <b>The time during which the effect evidence synthesis is intended to be in use</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EffectEvidenceSynthesis.effectivePeriod</b><br>
   * </p>
   */
  @SearchParamDefinition(name="effective", path="EffectEvidenceSynthesis.effectivePeriod", description="The time during which the effect evidence synthesis is intended to be in use", type="date" )
  public static final String SP_EFFECTIVE = "effective";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>effective</b>
   * <p>
   * Description: <b>The time during which the effect evidence synthesis is intended to be in use</b><br>
   * Type: <b>date</b><br>
   * Path: <b>EffectEvidenceSynthesis.effectivePeriod</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam EFFECTIVE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_EFFECTIVE);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="EffectEvidenceSynthesis.name", description="Computationally friendly name of the effect evidence synthesis", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Computationally friendly name of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="(EffectEvidenceSynthesis.useContext.value as CodeableConcept)", description="A use context assigned to the effect evidence synthesis", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.publisher</b><br>
   * </p>
   */
  @SearchParamDefinition(name="publisher", path="EffectEvidenceSynthesis.publisher", description="Name of the publisher of the effect evidence synthesis", type="string" )
  public static final String SP_PUBLISHER = "publisher";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
   * <p>
   * Description: <b>Name of the publisher of the effect evidence synthesis</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EffectEvidenceSynthesis.publisher</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PUBLISHER = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PUBLISHER);

 /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the effect evidence synthesis</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-quantity", path="EffectEvidenceSynthesis.useContext", description="A use context type and quantity- or range-based value assigned to the effect evidence synthesis", type="composite", compositeOf={"context-type", "context-quantity"} )
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the effect evidence synthesis</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(SP_CONTEXT_TYPE_QUANTITY);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="EffectEvidenceSynthesis.status", description="The current status of the effect evidence synthesis", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the effect evidence synthesis</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EffectEvidenceSynthesis.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}
