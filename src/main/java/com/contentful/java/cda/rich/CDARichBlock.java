package com.contentful.java.cda.rich;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A collection of several nodes.
 */
public class CDARichBlock extends CDARichNode implements Serializable {
  final List<CDARichNode> content = new LinkedList<>();

  /**
   * @return a changeable list of contents of this block
   */
  public List<CDARichNode> getContent() {
    return content;
  }
}
