import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Booking } from '../models/booking';
import { BookingService } from '../servicess/booking.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-bookingstatus',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './bookingstatus.component.html',
  styleUrl: './bookingstatus.component.css'
})
export class BookingstatusComponent implements OnInit {
  b:Booking[]=[]
 
ngOnInit(): void {
  this.bs.getAll().subscribe((data:Booking[])=>
  {
    if(data!=null)
    {
      this.b=data
      this.b=this.b.filter((bo:Booking)=>{
      
        return bo.uid==localStorage.getItem("uid")
      
     } )
    }
  }
  )
}
constructor(private bs:BookingService)
{

}
}
