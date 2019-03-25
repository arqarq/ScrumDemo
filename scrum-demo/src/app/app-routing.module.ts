import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {NewAccountComponent} from "./new-account/new-account.component";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
  {path: 'new_account', component: NewAccountComponent},
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: '/new_account', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
