/*
 * Copyright (c) 2017 Uber Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.sparkscript.antlr4.parsing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uber.sparkscript.util.CounterMap;

import java.util.ArrayList;
import java.util.List;

public class RootStatement implements java.io.Serializable {
  private List<FileAssignment> fileAssignments = new ArrayList<>();
  private List<StatementAssignment> jsonQueryStatementAssignments = new ArrayList<>();
  private List<StatementAssignment> statementAssignments = new ArrayList<>();
  private List<ActionStatement> actionStatements = new ArrayList<>();

  private CounterMap tableReferenceCount = new CounterMap();

  public List<FileAssignment> getFileAssignments() {
    return fileAssignments;
  }

  public void setFileAssignments(List<FileAssignment> fileAssignments) {
    this.fileAssignments = fileAssignments;
  }

  public List<StatementAssignment> getJsonQueryStatementAssignments() {
    return jsonQueryStatementAssignments;
  }

  public void setJsonQueryStatementAssignments(List<StatementAssignment> jsonQueryStatementAssignments) {
    this.jsonQueryStatementAssignments = jsonQueryStatementAssignments;
  }

  public List<StatementAssignment> getStatementAssignments() {
    return statementAssignments;
  }

  public void setStatementAssignments(List<StatementAssignment> statementAssignments) {
    this.statementAssignments = statementAssignments;
  }

  public List<ActionStatement> getActionStatements() {
    return actionStatements;
  }

  public void setActionStatements(List<ActionStatement> actionStatements) {
    this.actionStatements = actionStatements;
  }


  @JsonIgnore
  public CounterMap getTableReferenceCount() {
    return tableReferenceCount;
  }

  public void setTableReferenceCount(CounterMap tableReferenceCount) {
    this.tableReferenceCount = tableReferenceCount;
  }

  @Override
  public String toString() {
    return "RootStatement{" +
            "fileAssignments=" + fileAssignments +
            ", jsonQueryStatementAssignments=" + jsonQueryStatementAssignments +
            ", statementAssignments=" + statementAssignments +
            ", actionStatements=" + actionStatements +
            ", tableReferenceCount=" + tableReferenceCount +
            '}';
  }
}
