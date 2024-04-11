package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
public class Tutorial {
  @Id
  private String id;

  private String title;
  private String description;
  private boolean published;
  private String _class;

  public Tutorial() {

  }

  public Tutorial(String title, String description, boolean published, String _class) {
    this.title = title;
    this.description = description;
    this.published = published;
    this._class = _class;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  public String get_class() {
    return _class;
  }

  public void set_class(String _class) {
    this._class = _class;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }
}
