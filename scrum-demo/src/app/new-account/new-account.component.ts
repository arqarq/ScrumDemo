import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent implements OnInit {
  constructor() {
  }

  ngOnInit() {
  }

  submitHide(f: NgForm): boolean {
    return !(f.controls['login'].dirty && f.controls['login'].valid) ||
      (f.controls['email'].invalid);
  }

  save(f: NgForm) {
    alert("OK!")
  }
}
