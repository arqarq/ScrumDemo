import {Component, OnInit} from '@angular/core';
import {NgSelectConfig} from "@ng-select/ng-select";

@Component({
  selector: 'app-list-all',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  bullets = [
    {name: 1, value: "Arek"},
    {name: 2, value: "Sekuła"}
  ];
  cities = [
    {id: 1, name: 'Vilnius', avatar: '//www.gravatar.com/avatar/b0d8c6e5ea589e6fc3d3e08afb1873bb?d=retro&r=g&s=30 2x'},
    {id: 2, name: 'Kaunas', avatar: '//www.gravatar.com/avatar/ddac2aa63ce82315b513be9dc93336e5?d=retro&r=g&s=15'},
    {id: 3, name: 'Pavilnys', avatar: '//www.gravatar.com/avatar/6acb7abf486516ab7fb0a6efa372042b?d=retro&r=g&s=15'},
    {id: 4, name: 'Siauliai', avatar: '//www.gravatar.com/avatar/b0d8c6e5ea589e6fc3d3e08afb1873bb?d=retro&r=g&s=30 2x'},
  ];
  cities3 = this.cities.slice();
  selectedCity = this.cities[0].name;
  selectedCity3 = this.cities3[2].name;

  constructor(private config: NgSelectConfig) {
    this.config.notFoundText = 'Custom not found';
  }

  ngOnInit() {
  }
}
