import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { ViewregisterComponent } from './viewregister/viewregister.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { LogoutComponent } from './logout/logout.component';
import { LocationComponent } from './location/location.component';
import { BuyNowComponent } from './buy-now/buy-now.component';
import { ViewBuyNowComponent } from './view-buy-now/view-buy-now.component';
import { ManageproductsComponent } from './manageproducts/manageproducts.component';
import { ProductsComponent } from './products/products.component';


export const routes: Routes = [
{path:'',component:HomeComponent},
{path:'products',component:ProductsComponent},
{path:'aboutus',component:AboutUsComponent},
{path:'register',component:RegisterComponent},
{path:'login',component:LoginComponent},
{path:'contactus',component:ContactUsComponent},
{path:'adminlogin',component:AdminLoginComponent},
{path:'buynow',component:BuyNowComponent},
{path:'feedback',component:FeedbackComponent},
{path:'logout',component:LogoutComponent},
{path:'location',component:LocationComponent},
{path:'viewfeedback',component:ViewfeedbackComponent},
{path:'manageproducts',component:ManageproductsComponent},
{path:'viewregister',component:ViewregisterComponent},
{path:'viewbuynow',component:ViewBuyNowComponent},





];

