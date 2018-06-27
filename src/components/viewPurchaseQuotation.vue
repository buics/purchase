<template>
    <div>
        <app-header quote="Purchase Quotation"></app-header>
        <div class="card">
            <div class="card-header">
                <strong class="card-title">View Purchase Quotation</strong>
            </div>
            <div class="car-body">
                <!--Table Start-->
                <div id="table" class="table-editable" style="padding:15px">
                    <table class="table table-bordered table-responsive-md table-striped text-center">
                        <tr>
                            <th class="text-center">Vendor</th>
                            <th class="text-center">Contact Person</th>
                            <th class="text-center">Post Date</th>
                            <th class="text-center">Request Date</th>
                            <th class="text-center">Status</th>
                            <th class="text-center"></th>
                        </tr>
                        <tr v-for="(item,index) in pQuotation" :key="index">
                            <td class="pt-3-half">{{item.vendor}}</td>
                            <td class="pt-3-half">{{item.cPerson}}</td>
                            <td class="pt-3-half">{{item.postDate}}</td>
                            <td class="pt-3-half">{{item.requiredDate}}</td>
                            <td class="pt-3-half">{{item.status}}</td>
                            <td>
                                <span>
                                    <button @click="changeClickKey(index)" type="button" class="btn btn-primary btn-rounded btn-sm my-0" data-toggle="modal" data-target="#viewModal">View</button>
                                </span>
                          
                                <span>
                                    <button type="button" class="btn btn-danger text-center" data-toggle="modal" data-target="#deleteModal">
                                        Delete
                                    </button>
                                </span>
                                <!-- Delete Modal -->
                                <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                    <div class="modal-dialog modal-dialog-centered" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLongTitle">Delete Quotation</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                        </div>
                                            <div class="modal-body text-center">
                                            Are you sure you want to delete this Quotation?
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                                                <button type="button" @click="(event) => { removeRow(event, index) }" data-dismiss="modal" class="btn btn-danger">Ok</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Modal End-->
                                <!-- View Modal -->
                                <div class="modal fade" id="viewModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                    <div class="modal-dialog modal-lg modal-dialog-centered" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLongTitle">View Quotation</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body text-center">
                                                <div class="row form-group">
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Vendor</label>
                                                    </div>
                                                    <div class="col-12 col-md-5" >
                                                        <input v-model="pQuotation[clickKey].vendor" type="text" id="text-input" name="vendor"  class="form-control">
                                                    </div>
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Posting Date</label>
                                                    </div>
                                                    <div class="col-12 col-md-3" >
                                                        <input v-model="pQuotation[clickKey].postDate" type="date" id="date-input" name="postingdate" placeholder="Text" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="row form-group">
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Name</label>
                                                    </div>
                                                    <div class="col-12 col-md-5" >
                                                        <input v-model="pQuotation[clickKey].requestedBy" type="text" disabled id="text-input" name="name" placeholder="Text" class="form-control">
                                                    </div>
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Valid Until</label>
                                                    </div>
                                                    <div class="col-12 col-md-3" >
                                                        <input v-model="pQuotation[clickKey].validUntildate" type="date" id="date-input" name="validUntil" placeholder="Text" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="row form-group">
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Contact Person</label>
                                                    </div>
                                                    <div class="col-12 col-md-5" >
                                                        <input v-model="pQuotation[clickKey].cPerson" type="text" id="text-input" name="contactPerson" placeholder="Text" class="form-control">
                                                    </div>
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Document date</label>
                                                    </div>
                                                    <div class="col-12 col-md-3" >
                                                        <input v-model="pQuotation[clickKey].docDate" type="date" id="date-input" name="documentDate" placeholder="Text" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="row form-group">
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Buyer</label>
                                                    </div>
                                                    <div class="col-12 col-md-5" >
                                                        <input v-model="pQuotation[clickKey].buyer" type="text" id="text-input" name="buyer" placeholder="Text" class="form-control">
                                                    </div>
                                                    <div class="col col-md-2" >
                                                        <label for="text-input" class=" form-control-label">Required date</label>
                                                    </div>
                                                    <div class="col-12 col-md-3" >
                                                        <input v-model="pQuotation[clickKey].requiredDate" type="date" id="date-input" name="requiredDate" placeholder="Text" class="form-control">
                                                    </div>
                                                </div>
                                                <div class="card">
                                                    <div class="card-header">
                                                    Items
                                                    </div>
                                                    <div class="card-body">
                                                    <!--Table Start-->
                        <div id="table" class="table-editable">
                            <table class="table table-bordered table-responsive-md table-striped text-center">
                                <tr>
                                    <th class="text-center">Item Number</th>
                                    <th class="text-center">Required Date</th>
                                    <th class="text-center">Quoted Date</th>
                                    <th class="text-center">Required Quantity</th>
                                    <th class="text-center">Quoted Quantity</th>
                                    <th class="text-center">Unit Price </th>
                                    <th class="text-center">Remove</th>
                                </tr>
                                
                                <tr v-for="(content,nndx) in items" :key="nndx">
                                    <td class="pt-3-half">{{content.itemNum}}</td>
                                    <td class="pt-3-half">{{content.reqDate}}</td>
                                    <td class="pt-3-half">{{content.quoDate}}</td>
                                    <td class="pt-3-half">{{content.reqQuan}}</td>
                                    <td class="pt-3-half">{{content.quoQuan}}</td>
                                    <td class="pt-3-half">{{content.unitPrice}}</td>
                                    <td>
                                        <span class="table-add">
                                            <button type="button" @click="(event) => { removeItemRow(event, nndx) }" class="btn btn-danger btn-rounded btn-sm my-0">Remove</button>
                                        </span>
                                    </td>
                                </tr>
                            </table>       
                        </div>
                        <!--Table End-->
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                                                <button type="button"  data-dismiss="modal" class="btn btn-danger">Update</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Modal End-->
                            </td>
                        </tr>
                    </table>   
                </div>
                <!--Table End-->
            </div>
        </div>
    </div>
</template>

<script>
import Header from './header'
export default {
 components: {
            appHeader: Header
    },
    data() {
        return {
            pQuotation: [],
            dataKeys: [],
            items: [],
            clickKey: 0,
            ndx: 0
        };
    },
    methods: {
        getData(){
            this.$http.get('',)
                .then(Response => {
                    return Response.json();
                })
                .then(data => {{
                    const resultArray = [];
                    for(let key in data){
                        this.ndx++;
                        resultArray.push(data[key]);
                        this.dataKeys.push(key);
                    }
                    this.pQuotation = resultArray;
                }});
        },
        changeClickKey(n){
            this.clickKey = n;
            this.items = this.pQuotation[n].items;
            //alert(""+ this.items.length);
            //alert(" " + this.pQuotation[n].vendor);
        },
        removeRow(e,n){
            this.pQuotation.splice(n, 1);
            this.$http.delete('', {body: {key: this.dataKeys[n]}})
                .then(Response => {
                    console.log(Response);
                });
            this.ndx--;
        },
        removeItemRow(e,n){
            this.items.splice(n, 1);
            this.ndx--;
        }
    },
    beforeMount()
        {
            this.getData();
        }
}
</script>

<style>

</style>
