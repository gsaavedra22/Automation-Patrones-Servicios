import {test} from '@playwright/test';
import {GuruLoginPage} from '../src/pages/GuruLoginPage';

test.beforeEach(async({page}) => { 
    await page.goto("https://demo.guru99.com/test/newtours/");

});
test(`Given Necesito reservar un vuelo
 When ingresar credenciales para vuelo
 Then visualizo los alojamientos disponibles`,async({page}) => {
    const pageGuru99 = new GuruLoginPage(page);
    await pageGuru99.reservationFlight();

 });