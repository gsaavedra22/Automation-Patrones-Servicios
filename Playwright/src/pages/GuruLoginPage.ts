import {Page} from "@playwright/test";

export class GuruLoginPage{
    
    readonly page:Page;
    constructor(page: Page){
    this.page=page;    }   



    async  loginGuru(){
    await this.page.locator('input[name="uid"]').click();
    await this.page.locator('input[name="uid"]').fill('mngr480448');
    await this.page.locator('input[name="password"]').click();
    await this.page.locator('input[name="password"]').fill('pynevYp');
    await this.page.getByRole('button', { name: 'LOGIN' }).click();
}

async  reservationFlight(){     
  await this.page.getByRole('link', { name: 'Flights' }).click();
  await this.page.getByRole('radio').nth(1).check();
  await this.page.locator('select[name="passCount"]').selectOption('2');
  await this.page.locator('select[name="fromPort"]').selectOption('Frankfurt');
  await this.page.locator('select[name="fromMonth"]').selectOption('3');
  await this.page.locator('select[name="fromDay"]').selectOption('16');
  await this.page.locator('select[name="toPort"]').selectOption('London');
  await this.page.locator('select[name="toMonth"]').selectOption('5');
  await this.page.getByRole('radio').nth(3).check();
  await this.page.locator('select[name="airline"]').selectOption('Blue Skies Airlines');
  await this.page.getByRole('button', { name: 'Submit' }).click();
}



};