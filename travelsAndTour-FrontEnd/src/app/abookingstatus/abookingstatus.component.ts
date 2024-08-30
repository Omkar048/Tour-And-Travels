import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Booking } from '../models/booking';
import { BookingService } from '../servicess/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-abookingstatus',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './abookingstatus.component.html',
  styleUrl: './abookingstatus.component.css'
})
export class AbookingstatusComponent implements OnInit {
  b:Booking[]=[]
  constructor(private as:BookingService,private router:Router)
  {
  
  }
  showapps()
  {
    this.as.getAll().subscribe((data:Booking[])=>
    {
      if(data!=null)
        this.b=data
    }
     )
  }
  ngOnInit(): void {
    this.showapps()
  }
  change(aid:any)
  {
    this.as.search(aid).subscribe((data:Booking)=>
    {
      if(data!=null)
      {
        let bo:Booking=data
        bo.status="Approve"
        this.as.update(aid,bo).subscribe((data1:Booking)=>
        {
          if(data1!=null)
          {
            this.showapps()
          }
        }
        )
      }
    }
    )
  }
}
