import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { Admin } from '../models/admin';
import { AdminService } from '../servicess/admin.service';


@Component({
  selector: 'app-alogin',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './alogin.component.html',
  styleUrl: './alogin.component.css'
})
export class AloginComponent {
  submitdata() {
    this.ads.login(this.a.email,this.a.password).subscribe((data:Admin)=>{
     if(data!=null)
     {
      alert("Login Successful")
      localStorage.setItem("aemail",this.a.email)
      localStorage.setItem("aid",data.aid)
      this.router.navigate(["/"])
     }
     else
     alert("incorrect username or password")
    })
  }
  
   a:Admin=new Admin()
  
   constructor(private ads:AdminService ,private router:Router)
  {
  
  }
}
