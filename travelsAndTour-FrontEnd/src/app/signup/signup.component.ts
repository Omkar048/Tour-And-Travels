import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { User } from '../models/user';
import { UserService } from '../servicess/user.service';

@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [FormsModule,CommonModule,RouterLink],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {

  submitdata(regForm:any){
    if(regForm.valid)
    {
      this.us.insert(this.u).subscribe((data:User)=>{
       if(data!=null)
        alert("Registration SuccessFull") 
      this.router.navigate(["/log"]) 

      })
    }
    else
   alert("plese input valid data")
  }
  u:User=new User()
  constructor(private us:UserService,private router:Router)
  {

  }

}
