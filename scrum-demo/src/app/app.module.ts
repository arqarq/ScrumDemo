import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {ListAllComponent} from './list-all/list-all.component';
import {FormsModule} from "@angular/forms";
import {NgSelectModule} from "@ng-select/ng-select";
import {RouterModule, Routes} from '@angular/router';

const appRoutes: Routes = [
  {path: 'dodajuzytkownika', component: null},
  {path: 'hero/:id', component: null},
  {
    path: 'heroes',
    component: null,
    data: {title: 'Heroes List'}
  },
  {
    path: '',
    redirectTo: '/heroes',
    pathMatch: 'full'
  },
  {path: '**', component: null}
];

@NgModule({
  declarations: [
    AppComponent,
    ListAllComponent
  ],
  imports: [
    BrowserModule,
    NgSelectModule,
    FormsModule
    // RouterModule.forRoot(
    //   appRoutes,
    //   {enableTracing: true} // <-- debugging purposes only
    // )
    // other imports here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
