package org.hl7.fhir.convertors.conv43_50.resources43_50;

import org.hl7.fhir.convertors.context.ConversionContext43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.general43_50.CodeableConcept43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.general43_50.Identifier43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.DateTime43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.String43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.primitive43_50.Uri43_50;
import org.hl7.fhir.convertors.conv43_50.datatypes43_50.special43_50.Reference43_50;
import org.hl7.fhir.exceptions.FHIRException;

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
// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0
public class DocumentManifest43_50 {

  public static org.hl7.fhir.r5.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.r4b.model.DocumentManifest src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.DocumentManifest tgt = new org.hl7.fhir.r5.model.DocumentManifest();
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyDomainResource(src, tgt);
    if (src.hasMasterIdentifier())
      tgt.setMasterIdentifier(Identifier43_50.convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.r4b.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier43_50.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations43_50.convertDocumentReferenceStatus(src.getStatusElement()));
    if (src.hasType())
      tgt.setType(CodeableConcept43_50.convertCodeableConcept(src.getType()));
    if (src.hasSubject())
      tgt.setSubject(Reference43_50.convertReference(src.getSubject()));
    if (src.hasCreated())
      tgt.setCreatedElement(DateTime43_50.convertDateTime(src.getCreatedElement()));
    for (org.hl7.fhir.r4b.model.Reference t : src.getAuthor()) tgt.addAuthor(Reference43_50.convertReference(t));
    for (org.hl7.fhir.r4b.model.Reference t : src.getRecipient()) tgt.addRecipient(Reference43_50.convertReference(t));
    if (src.hasSource())
      tgt.setSourceElement(Uri43_50.convertUri(src.getSourceElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(String43_50.convertString(src.getDescriptionElement()));
    for (org.hl7.fhir.r4b.model.Reference t : src.getContent()) tgt.addContent(Reference43_50.convertReference(t));
    for (org.hl7.fhir.r4b.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r4b.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.r5.model.DocumentManifest src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4b.model.DocumentManifest tgt = new org.hl7.fhir.r4b.model.DocumentManifest();
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyDomainResource(src, tgt);
    if (src.hasMasterIdentifier())
      tgt.setMasterIdentifier(Identifier43_50.convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier43_50.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations43_50.convertDocumentReferenceStatus(src.getStatusElement()));
    if (src.hasType())
      tgt.setType(CodeableConcept43_50.convertCodeableConcept(src.getType()));
    if (src.hasSubject())
      tgt.setSubject(Reference43_50.convertReference(src.getSubject()));
    if (src.hasCreated())
      tgt.setCreatedElement(DateTime43_50.convertDateTime(src.getCreatedElement()));
    for (org.hl7.fhir.r5.model.Reference t : src.getAuthor()) tgt.addAuthor(Reference43_50.convertReference(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getRecipient()) tgt.addRecipient(Reference43_50.convertReference(t));
    if (src.hasSource())
      tgt.setSourceElement(Uri43_50.convertUri(src.getSourceElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(String43_50.convertString(src.getDescriptionElement()));
    for (org.hl7.fhir.r5.model.Reference t : src.getContent()) tgt.addContent(Reference43_50.convertReference(t));
    for (org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.r4b.model.DocumentManifest.DocumentManifestRelatedComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent();
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyBackboneElement(src, tgt);
    if (src.hasIdentifier())
      tgt.setIdentifier(Identifier43_50.convertIdentifier(src.getIdentifier()));
    if (src.hasRef())
      tgt.setRef(Reference43_50.convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.r4b.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4b.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.r4b.model.DocumentManifest.DocumentManifestRelatedComponent();
    ConversionContext43_50.INSTANCE.getVersionConvertor_43_50().copyBackboneElement(src, tgt);
    if (src.hasIdentifier())
      tgt.setIdentifier(Identifier43_50.convertIdentifier(src.getIdentifier()));
    if (src.hasRef())
      tgt.setRef(Reference43_50.convertReference(src.getRef()));
    return tgt;
  }
}