package org.dbpedia.extraction.mappings.rml.translation.model

/**
  * RML Template Mapping converted from the DBpedia mappings
  */
class RMLTemplateMapping(modelWrapper: ModelWrapper) extends RMLMapping {

  def printAsNTriples: Unit =
  {
    modelWrapper.printAsNTriples
  }

  def printAsTurtle: Unit =
  {
    modelWrapper.printAsTurtle
  }

  def writeAsTurtle: String =
  {
    modelWrapper.writeAsTurtle
  }

  def writeAsNTriples: String =
  {
    modelWrapper.writeAsNTriples
  }
}