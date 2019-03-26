import {Component, OnInit} from '@angular/core';
import {Title} from "@angular/platform-browser";
import * as $ from 'jquery';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  logged: boolean = true;

  public constructor(private titleService: Title) {
  }

  ngOnInit() {
    this.setTitle('Twitter')
  }

  private setTitle(newTitle: string) {
    this.titleService.setTitle(newTitle)
  }
}
