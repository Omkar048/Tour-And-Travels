import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import path from 'path';
import { GallaryComponent } from './gallary/gallary.component';
import { BookComponent } from './book/book.component';
import { LoginComponent } from './login/login.component';
import { PackagesComponent } from './packages/packages.component';
import { ServicesComponent } from './services/services.component';
import { SignupComponent } from './signup/signup.component';
import { AloginComponent } from './alogin/alogin.component';
import { AsignupComponent } from './asignup/asignup.component';
import { BookingstatusComponent } from './bookingstatus/bookingstatus.component';
import { AbookingstatusComponent } from './abookingstatus/abookingstatus.component';

export const routes: Routes = [
{path:"hm",component:HomeComponent},
{path:"ab",component:AboutComponent},
{path:"ga",component:GallaryComponent},
{path:"bo",component:BookComponent},
{path:"log",component:LoginComponent},
{path:"pkg",component:PackagesComponent},
{path:"ser",component:ServicesComponent},
{path:"sign",component:SignupComponent},
{path:"asign",component:AsignupComponent},
{path:"alog",component:AloginComponent},
{path:"bs",component:BookingstatusComponent},
{path:"abs",component:AbookingstatusComponent}


];
