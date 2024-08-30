import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { User } from '../models/user';
import { UserService } from '../servicess/user.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule,RouterLink,],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
 
  submitdata() {
    this.ps.login(this.u.emailId,this.u.password).subscribe((data:User)=>{
     if(data!=null)
     {
      alert("Login Successful")
      localStorage.setItem("uemail",this.u.emailId)
      localStorage.setItem("uid",data.uid)
      this.router.navigate(["/"])
     }
     else
     alert("incorrect username or password")
    })
  }
  
   u:User=new User()
  
   constructor(private ps :UserService ,private router:Router)
  {
  
  }
}
