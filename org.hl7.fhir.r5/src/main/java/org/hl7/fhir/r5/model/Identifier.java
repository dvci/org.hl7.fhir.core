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
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Identifier Type: An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
 */
@DatatypeDef(name="Identifier")
public class Identifier extends DataType implements ICompositeType {

    public enum IdentifierUse {
        /**
         * The identifier recommended for display and use in real-world interactions which should be used when such identifier is different from the \"official\" identifier.
         */
        USUAL, 
        /**
         * The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use.
         */
        OFFICIAL, 
        /**
         * A temporary identifier.
         */
        TEMP, 
        /**
         * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
         */
        SECONDARY, 
        /**
         * The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc.
         */
        OLD, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static IdentifierUse fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("usual".equals(codeString))
          return USUAL;
        if ("official".equals(codeString))
          return OFFICIAL;
        if ("temp".equals(codeString))
          return TEMP;
        if ("secondary".equals(codeString))
          return SECONDARY;
        if ("old".equals(codeString))
          return OLD;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown IdentifierUse code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case USUAL: return "usual";
            case OFFICIAL: return "official";
            case TEMP: return "temp";
            case SECONDARY: return "secondary";
            case OLD: return "old";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case USUAL: return "http://hl7.org/fhir/identifier-use";
            case OFFICIAL: return "http://hl7.org/fhir/identifier-use";
            case TEMP: return "http://hl7.org/fhir/identifier-use";
            case SECONDARY: return "http://hl7.org/fhir/identifier-use";
            case OLD: return "http://hl7.org/fhir/identifier-use";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case USUAL: return "The identifier recommended for display and use in real-world interactions which should be used when such identifier is different from the \"official\" identifier.";
            case OFFICIAL: return "The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use.";
            case TEMP: return "A temporary identifier.";
            case SECONDARY: return "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.";
            case OLD: return "The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case USUAL: return "Usual";
            case OFFICIAL: return "Official";
            case TEMP: return "Temp";
            case SECONDARY: return "Secondary";
            case OLD: return "Old";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class IdentifierUseEnumFactory implements EnumFactory<IdentifierUse> {
    public IdentifierUse fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("usual".equals(codeString))
          return IdentifierUse.USUAL;
        if ("official".equals(codeString))
          return IdentifierUse.OFFICIAL;
        if ("temp".equals(codeString))
          return IdentifierUse.TEMP;
        if ("secondary".equals(codeString))
          return IdentifierUse.SECONDARY;
        if ("old".equals(codeString))
          return IdentifierUse.OLD;
        throw new IllegalArgumentException("Unknown IdentifierUse code '"+codeString+"'");
        }
        public Enumeration<IdentifierUse> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<IdentifierUse>(this, IdentifierUse.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<IdentifierUse>(this, IdentifierUse.NULL, code);
        if ("usual".equals(codeString))
          return new Enumeration<IdentifierUse>(this, IdentifierUse.USUAL, code);
        if ("official".equals(codeString))
          return new Enumeration<IdentifierUse>(this, IdentifierUse.OFFICIAL, code);
        if ("temp".equals(codeString))
          return new Enumeration<IdentifierUse>(this, IdentifierUse.TEMP, code);
        if ("secondary".equals(codeString))
          return new Enumeration<IdentifierUse>(this, IdentifierUse.SECONDARY, code);
        if ("old".equals(codeString))
          return new Enumeration<IdentifierUse>(this, IdentifierUse.OLD, code);
        throw new FHIRException("Unknown IdentifierUse code '"+codeString+"'");
        }
    public String toCode(IdentifierUse code) {
      if (code == IdentifierUse.USUAL)
        return "usual";
      if (code == IdentifierUse.OFFICIAL)
        return "official";
      if (code == IdentifierUse.TEMP)
        return "temp";
      if (code == IdentifierUse.SECONDARY)
        return "secondary";
      if (code == IdentifierUse.OLD)
        return "old";
      return "?";
      }
    public String toSystem(IdentifierUse code) {
      return code.getSystem();
      }
    }

    /**
     * The purpose of this identifier.
     */
    @Child(name = "use", type = {CodeType.class}, order=0, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="usual | official | temp | secondary | old (If known)", formalDefinition="The purpose of this identifier." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/identifier-use")
    protected Enumeration<IdentifierUse> use;

    /**
     * A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Description of identifier", formalDefinition="A coded type for the identifier that can be used to determine which identifier to use for a specific purpose." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/identifier-type")
    protected CodeableConcept type;

    /**
     * Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.
     */
    @Child(name = "system", type = {UriType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The namespace for the identifier value", formalDefinition="Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique." )
    protected UriType system;

    /**
     * The portion of the identifier typically relevant to the user and which is unique within the context of the system.
     */
    @Child(name = "value", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The value that is unique", formalDefinition="The portion of the identifier typically relevant to the user and which is unique within the context of the system." )
    protected StringType value;

    /**
     * Time period during which identifier is/was valid for use.
     */
    @Child(name = "period", type = {Period.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Time period when id is/was valid for use", formalDefinition="Time period during which identifier is/was valid for use." )
    protected Period period;

    /**
     * Organization that issued/manages the identifier.
     */
    @Child(name = "assigner", type = {Organization.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Organization that issued id (may be just text)", formalDefinition="Organization that issued/manages the identifier." )
    protected Reference assigner;

    private static final long serialVersionUID = 2098433371L;

  /**
   * Constructor
   */
    public Identifier() {
      super();
    }

    /**
     * @return {@link #use} (The purpose of this identifier.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Enumeration<IdentifierUse> getUseElement() { 
      if (this.use == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.use");
        else if (Configuration.doAutoCreate())
          this.use = new Enumeration<IdentifierUse>(new IdentifierUseEnumFactory()); // bb
      return this.use;
    }

    public boolean hasUseElement() { 
      return this.use != null && !this.use.isEmpty();
    }

    public boolean hasUse() { 
      return this.use != null && !this.use.isEmpty();
    }

    /**
     * @param value {@link #use} (The purpose of this identifier.). This is the underlying object with id, value and extensions. The accessor "getUse" gives direct access to the value
     */
    public Identifier setUseElement(Enumeration<IdentifierUse> value) { 
      this.use = value;
      return this;
    }

    /**
     * @return The purpose of this identifier.
     */
    public IdentifierUse getUse() { 
      return this.use == null ? null : this.use.getValue();
    }

    /**
     * @param value The purpose of this identifier.
     */
    public Identifier setUse(IdentifierUse value) { 
      if (value == null)
        this.use = null;
      else {
        if (this.use == null)
          this.use = new Enumeration<IdentifierUse>(new IdentifierUseEnumFactory());
        this.use.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #type} (A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.)
     */
    public Identifier setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #system} (Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public UriType getSystemElement() { 
      if (this.system == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.system");
        else if (Configuration.doAutoCreate())
          this.system = new UriType(); // bb
      return this.system;
    }

    public boolean hasSystemElement() { 
      return this.system != null && !this.system.isEmpty();
    }

    public boolean hasSystem() { 
      return this.system != null && !this.system.isEmpty();
    }

    /**
     * @param value {@link #system} (Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.). This is the underlying object with id, value and extensions. The accessor "getSystem" gives direct access to the value
     */
    public Identifier setSystemElement(UriType value) { 
      this.system = value;
      return this;
    }

    /**
     * @return Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.
     */
    public String getSystem() { 
      return this.system == null ? null : this.system.getValue();
    }

    /**
     * @param value Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.
     */
    public Identifier setSystem(String value) { 
      if (Utilities.noString(value))
        this.system = null;
      else {
        if (this.system == null)
          this.system = new UriType();
        this.system.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #value} (The portion of the identifier typically relevant to the user and which is unique within the context of the system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public StringType getValueElement() { 
      if (this.value == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.value");
        else if (Configuration.doAutoCreate())
          this.value = new StringType(); // bb
      return this.value;
    }

    public boolean hasValueElement() { 
      return this.value != null && !this.value.isEmpty();
    }

    public boolean hasValue() { 
      return this.value != null && !this.value.isEmpty();
    }

    /**
     * @param value {@link #value} (The portion of the identifier typically relevant to the user and which is unique within the context of the system.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
     */
    public Identifier setValueElement(StringType value) { 
      this.value = value;
      return this;
    }

    /**
     * @return The portion of the identifier typically relevant to the user and which is unique within the context of the system.
     */
    public String getValue() { 
      return this.value == null ? null : this.value.getValue();
    }

    /**
     * @param value The portion of the identifier typically relevant to the user and which is unique within the context of the system.
     */
    public Identifier setValue(String value) { 
      if (Utilities.noString(value))
        this.value = null;
      else {
        if (this.value == null)
          this.value = new StringType();
        this.value.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #period} (Time period during which identifier is/was valid for use.)
     */
    public Period getPeriod() { 
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() { 
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Time period during which identifier is/was valid for use.)
     */
    public Identifier setPeriod(Period value) { 
      this.period = value;
      return this;
    }

    /**
     * @return {@link #assigner} (Organization that issued/manages the identifier.)
     */
    public Reference getAssigner() { 
      if (this.assigner == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Identifier.assigner");
        else if (Configuration.doAutoCreate())
          this.assigner = new Reference(); // cc
      return this.assigner;
    }

    public boolean hasAssigner() { 
      return this.assigner != null && !this.assigner.isEmpty();
    }

    /**
     * @param value {@link #assigner} (Organization that issued/manages the identifier.)
     */
    public Identifier setAssigner(Reference value) { 
      this.assigner = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("use", "code", "The purpose of this identifier.", 0, 1, use));
        children.add(new Property("type", "CodeableConcept", "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.", 0, 1, type));
        children.add(new Property("system", "uri", "Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.", 0, 1, system));
        children.add(new Property("value", "string", "The portion of the identifier typically relevant to the user and which is unique within the context of the system.", 0, 1, value));
        children.add(new Property("period", "Period", "Time period during which identifier is/was valid for use.", 0, 1, period));
        children.add(new Property("assigner", "Reference(Organization)", "Organization that issued/manages the identifier.", 0, 1, assigner));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116103: /*use*/  return new Property("use", "code", "The purpose of this identifier.", 0, 1, use);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.", 0, 1, type);
        case -887328209: /*system*/  return new Property("system", "uri", "Establishes the namespace for the value - that is, a absolute URL that describes a set values that are unique.", 0, 1, system);
        case 111972721: /*value*/  return new Property("value", "string", "The portion of the identifier typically relevant to the user and which is unique within the context of the system.", 0, 1, value);
        case -991726143: /*period*/  return new Property("period", "Period", "Time period during which identifier is/was valid for use.", 0, 1, period);
        case -369881636: /*assigner*/  return new Property("assigner", "Reference(Organization)", "Organization that issued/manages the identifier.", 0, 1, assigner);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116103: /*use*/ return this.use == null ? new Base[0] : new Base[] {this.use}; // Enumeration<IdentifierUse>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -887328209: /*system*/ return this.system == null ? new Base[0] : new Base[] {this.system}; // UriType
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // StringType
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -369881636: /*assigner*/ return this.assigner == null ? new Base[0] : new Base[] {this.assigner}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116103: // use
          value = new IdentifierUseEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.use = (Enumeration) value; // Enumeration<IdentifierUse>
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -887328209: // system
          this.system = TypeConvertor.castToUri(value); // UriType
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToString(value); // StringType
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -369881636: // assigner
          this.assigner = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("use")) {
          value = new IdentifierUseEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.use = (Enumeration) value; // Enumeration<IdentifierUse>
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("system")) {
          this.system = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("value")) {
          this.value = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("assigner")) {
          this.assigner = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116103:  return getUseElement();
        case 3575610:  return getType();
        case -887328209:  return getSystemElement();
        case 111972721:  return getValueElement();
        case -991726143:  return getPeriod();
        case -369881636:  return getAssigner();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116103: /*use*/ return new String[] {"code"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -887328209: /*system*/ return new String[] {"uri"};
        case 111972721: /*value*/ return new String[] {"string"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case -369881636: /*assigner*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("use")) {
          throw new FHIRException("Cannot call addChild on a primitive type Identifier.use");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("system")) {
          throw new FHIRException("Cannot call addChild on a primitive type Identifier.system");
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a primitive type Identifier.value");
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("assigner")) {
          this.assigner = new Reference();
          return this.assigner;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Identifier";

  }

      public Identifier copy() {
        Identifier dst = new Identifier();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Identifier dst) {
        super.copyValues(dst);
        dst.use = use == null ? null : use.copy();
        dst.type = type == null ? null : type.copy();
        dst.system = system == null ? null : system.copy();
        dst.value = value == null ? null : value.copy();
        dst.period = period == null ? null : period.copy();
        dst.assigner = assigner == null ? null : assigner.copy();
      }

      protected Identifier typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Identifier))
          return false;
        Identifier o = (Identifier) other_;
        return compareDeep(use, o.use, true) && compareDeep(type, o.type, true) && compareDeep(system, o.system, true)
           && compareDeep(value, o.value, true) && compareDeep(period, o.period, true) && compareDeep(assigner, o.assigner, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Identifier))
          return false;
        Identifier o = (Identifier) other_;
        return compareValues(use, o.use, true) && compareValues(system, o.system, true) && compareValues(value, o.value, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(use, type, system, value
          , period, assigner);
      }

      @Override
      public String toString() {
        return getSystem()+":"+getValue();
      }


}
