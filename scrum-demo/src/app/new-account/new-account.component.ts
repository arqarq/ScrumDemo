import {Component, OnInit} from '@angular/core';
import {NgForm} from '@angular/forms';
import {Router} from '@angular/router';
import * as $ from '../../jquery-3.3.1.js';

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css']
})
export class NewAccountComponent implements OnInit {
  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  submitHide(ff: NgForm): boolean {
    return !(ff.controls['login'].dirty && ff.controls['login'].valid) ||
      (ff.controls['email'].invalid);
  }

  save(f: NgForm) {
    // alert("OK!");
    // let booleanPromise = this.router.navigate(['login']);
    // alert(typeof booleanPromise);
    $.ajax({
      url: "http://localhost/new_account",
      method: "post",
      contentType: "application/json",
      data: JSON.stringify(f.value),
      success: function (account) {
        // alert("-" + window.id + " " + window.width + " " + window.height);
        alert("dodano konto z login: " + account.email + ", id: " + account.id)
      }
    })
  }
}
